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
	Private xui As XUI
End Sub

Sub Globals
	Private ActionBarButton As ACActionBar
	Private ToolBar As ACToolBarLight
	Private xmlIcon As XmlLayoutBuilder
	
	Dim bd As BitmapDrawable
End Sub
#End Region

#Region Activity Events
Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("Notifications")

	If Starter.appCrashed Then
		Log("App previously crashed")
		' Handle the previous crash scenario, like showing a message to the user
		ToastMessageShow("The app encountered an error and recovered.", True)
		Starter.appCrashed = False ' Reset the crash flag
	End If

	bd.Initialize(LoadBitmap(File.DirAssets, "back.png"))
	
	GlobalVar.CSTitle.Initialize.Color(Colors.White).Size(18).Bold.Append($"Notifications"$).PopAll
	GlobalVar.CSSubTitle.Initialize.Color(Colors.White).Size(15).Append($"Development Phase"$).PopAll
	
	ToolBar.NavigationIconDrawable = bd
	ToolBar.InitMenuListener
	ToolBar.Title = GlobalVar.CSTitle
	ToolBar.SubTitle = GlobalVar.CSSubTitle
	ToolBar.SetElevationAnimated(5, 5dip)

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
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Activity_CreateMenu(Menu As ACMenu)
End Sub


Sub Activity_Touch (Action As Int, X As Float, Y As Float)
	
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
	If KeyCode = 4 Then
		Activity.Finish
		Return True
	Else
		Return False
	End If
End Sub

Sub Activity_PermissionResult (Permission As String, Result As Boolean)
	
End Sub
#End Region

Sub ToolBar_NavigationItemClick
	activity.Finish
End Sub

Sub ToolBar_MenuItemClick (Item As ACMenuItem)
	Select Case Item.Id
		Case 1 'Notification
'			StartActivity(not)
	End Select
End Sub