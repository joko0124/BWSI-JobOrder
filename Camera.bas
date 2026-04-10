B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=7.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: True
	#IncludeTitle: False
#End Region
#Extends: android.support.v7.app.AppCompatActivity

Sub Process_Globals
	Private frontCamera As Boolean = False
End Sub

Sub Globals
	Private Panel1 As Panel
	Private camEx As CameraExClass
End Sub

Sub Activity_Create(FirstTime As Boolean)
'	Activity.LoadLayout("Camera")
End Sub

Sub Activity_Resume
	InitializeCamera
End Sub

Private Sub InitializeCamera
	camEx.Initialize(Panel1, frontCamera, Me, "Camera1")
	frontCamera = camEx.Front
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	camEx.Release
End Sub

Sub Camera1_Ready (Success As Boolean)
	If Success Then
		camEx.StartPreview
		camEx.SetJpegQuality(90)
		camEx.CommitParameters
	Else
		ToastMessageShow("Cannot open camera.", True)
	End If
End Sub

Sub btnTakePicture_Click
	camEx.TakePicture
End Sub

Sub Camera1_PictureTaken (Data() As Byte)
End Sub

Sub btnChangeCam_Click
	camEx.Release
	frontCamera = Not(frontCamera)
	InitializeCamera
End Sub

Sub btnFlash_Click
	Dim flashModes As List = camEx.GetSupportedFlashModes
	If flashModes.IsInitialized = False Then
		ToastMessageShow("Flash not supported.", False)
		Return
	End If
	Dim flash As String = flashModes.Get((flashModes.IndexOf(camEx.GetFlashMode) + 1) Mod flashModes.Size)
	camEx.SetFlashMode(flash)
	ToastMessageShow(flash, False)
	camEx.CommitParameters
End Sub
