B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Service
Version=9.9
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	#ExcludeFromLibrary: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Public DBCon As SQL
	Public strCriteria As String
	Public DBPath As String
	Public RTP As RuntimePermissions

	Public SafeDirectory As String
	Public DBName As String = "MasterDB.db"
	
	Public GPS1 As GPS
	Private GPSStarted As Boolean
	
	Public FLP As FusedLocationProvider
	Private flpStarted As Boolean

	Private logs As StringBuilder
	Private logcat As LogCat
	Dim appCrashed As Boolean
End Sub

Sub Service_Create
	'This is the program entry point.
	'This is a good place to load resources that are not specific to a single activity.
	Log(RTP.GetSafeDirDefaultExternal(""))
	DBPath = DBUtils.CopyDBFromAssets("MasterDB.db")

	Dim jo As JavaObject
	If jo.IsInitialized = False Then
		jo.InitializeStatic("java.util.Locale").RunMethod("setDefault", Array(jo.GetField("US")))
	End If
	
	SafeDirectory = RTP.GetSafeDirDefaultExternal("")
	
	If File.Exists(SafeDirectory, DBName) = False Then
		Wait For (File.CopyAsync(File.DirAssets, DBName, SafeDirectory, DBName)) Complete (Success As Boolean) 'File.DirInternal
		ToastMessageShow($"DB Copied = ${Success}"$, False)
'		Log("Success: " & Success)
	End If
	appCrashed = False
End Sub

Sub Service_Start (StartingIntent As Intent)
	Service.StopAutomaticForeground 'Starter service can start in the foreground state in some edge cases.
	If File.Exists(File.DirRootExternal,"exitapp.log") Then 'CE UN FILE
		LogColor("GESTURE ERROR WITH SEND EMAIL RESTAT APP",Colors.Yellow)
		File.Delete(File.DirRootExternal,"exitapp.log")
		StopService(Me)
		ExitApplication
		Return
	End If
End Sub

Sub Service_TaskRemoved
	'This event will be raised when the user removes the app from the recent apps list.
End Sub

'Return true to allow the OS default exceptions handler to handle the uncaught exception.
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	Return True
End Sub

Sub Service_Destroy
	StopGps
End Sub

'CONNECT TO DATABASE A LOAD SETTINGS
Public Sub ConnectToDatabase
'	DBCon.Initialize(DBPath, "MasterDB.db",False)
	If DBCon.IsInitialized = False Then
		DBCon.Initialize(SafeDirectory, DBName, False)
	End If
	DBCon.Initialize(SafeDirectory, DBName, False)
End Sub

#Region GPS
Public Sub StartGps
	If GPSStarted = False Then
		GPS1.Start(0, 0)
		GPSStarted = True
	End If
End Sub

Public Sub StopGps
	If GPSStarted Then
		GPS1.Stop
		GPSStarted = False
	End If
End Sub

Sub GPS_LocationChanged (Location1 As Location)
	CallSub2(Main, "LocationChanged", Location1)
End Sub

Sub GPS_GpsStatus (Satellites As List)
	CallSub2(Main, "GPSStatus", Satellites)
End Sub

#End Region
