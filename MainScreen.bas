B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=10
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region
#Extends: android.support.v7.app.AppCompatActivity
#If Java

public boolean _onCreateOptionsMenu(android.view.Menu menu) {
	if (processBA.subExists("activity_createmenu")) {
		processBA.raiseEvent2(null, true, "activity_createmenu", false, new de.amberhome.objects.appcompat.ACMenuWrapper(menu));
		return true;
	}
	else
		return false;
}
#End If

#Region Declarations
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Private xui As XUI
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private ActionBarButton As ACActionBar
	Private ToolBar As ACToolBarLight
	Private xmlIcon As XmlLayoutBuilder
	
	Dim bd As BitmapDrawable
	Dim bdLogout, bdNotif As BitmapDrawable

	Private lblAvatar As Label
	Private lblBranchName As Label
	Private lblEmpName As Label
	Private lblNumAccomplished As Label
	Private lblNumCancelled As Label
	Private lblNumOngoing As Label
	Private lblNumPending As Label
	Private lblReadingPeriod As Label
	Private lblTitleAccomplished As Label
	Private lblTitleCancelled As Label
	Private lblTitleOngoing As Label
	Private lblTitlePending As Label
	Private btnSyncJO As ACButton
	
	Dim csBuild As CSBuilder
End Sub
#End Region

#Region Activity Events
Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("Dashboard")

	If Starter.appCrashed Then
		Log("App previously crashed")
		' Handle the previous crash scenario, like showing a message to the user
		ToastMessageShow("The app encountered an error and recovered.", True)
		Starter.appCrashed = False ' Reset the crash flag
	End If

	bd.Initialize(LoadBitmap(File.DirAssets, "bw.png"))
	
	GlobalVar.CSTitle.Initialize.Color(Colors.White).Size(18).Bold.Append(Application.LabelName).PopAll
	GlobalVar.CSSubTitle.Initialize.Color(Colors.White).Size(15).Append($"Development Phase"$).PopAll
	
	ToolBar.NavigationIconDrawable = bd
	ToolBar.InitMenuListener
	ToolBar.Title = GlobalVar.CSTitle
	ToolBar.SubTitle = GlobalVar.CSSubTitle
	ToolBar.SetElevationAnimated(0, 0)

	Dim jo As JavaObject
	Dim xl As XmlLayoutBuilder
	jo = ToolBar
	jo.RunMethod("setPopupTheme", Array(xl.GetResourceId("style", "ToolbarMenu")))
	jo.RunMethod("setContentInsetStartWithNavigation", Array(1dip))
	jo.RunMethod("setTitleMarginStart", Array(0dip))
		
	ActionBarButton.Initialize
	ActionBarButton.ShowUpIndicator = False
	

	If FirstTime Then
	End If
	Misc.SetStatusBarAndNavigationColor(GlobalVar.PriColor)
	Misc.EnableButton(btnSyncJO)
	
	csBuild.Initialize _
    .Typeface(Typeface.MATERIALICONS).Size(26).Append(Chr(0xE627)) _
    .Typeface(Typeface.DEFAULT_BOLD).Size(22).Append(" SYNC JOB ORDER(S)") _
    .PopAll

	btnSyncJO.Text = csBuild
	btnSyncJO.Gravity = Gravity.CENTER
	btnSyncJO.Padding = Array As Int(16dip, 10dip, 16dip, 10dip)


End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Activity_CreateMenu(Menu As ACMenu)
	Dim Item As ACMenuItem
	bdLogout.Initialize(LoadBitmap(File.DirAssets, "new-logout.png"))
	bdNotif.Initialize(LoadBitmap(File.DirAssets, "notif.png"))
	
	Menu.Clear
	Menu.Add2(1, 1, "Notification", bdNotif).ShowAsAction = Item.SHOW_AS_ACTION_IF_ROOM
	Menu.Add2(2, 2, "Logout", bdLogout).ShowAsAction = Item.SHOW_AS_ACTION_IF_ROOM
End Sub


Sub Activity_Touch (Action As Int, X As Float, Y As Float)
	
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
	
End Sub

Sub Activity_PermissionResult (Permission As String, Result As Boolean)
	
End Sub
#End Region

Sub ToolBar_NavigationItemClick
	
End Sub

Sub ToolBar_MenuItemClick (Item As ACMenuItem)
	Select Case Item.Id
		Case 1 'Notification
			StartActivity(Notif)
	End Select
End Sub