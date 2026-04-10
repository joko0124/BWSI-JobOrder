B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=10
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Public Sub SetStatusBarAndNavigationColor(clr As Int)
	Try
		Dim jo As JavaObject
		jo.InitializeContext
		Dim window As JavaObject = jo.RunMethodJO("getWindow", Null)
		window.RunMethod("addFlags", Array (0x80000000))
		window.RunMethod("clearFlags", Array (0x04000000))
		window.RunMethod("setStatusBarColor", Array(clr))
		Dim jo2 As JavaObject
		jo2.InitializeContext
		jo2.RunMethodJO("getWindow", Null).RunMethod("setNavigationBarColor", Array(clr))
	Catch
		ToastMessageShow("Some error with your android version ( <5 )",True)
	End Try
End Sub

Public Sub SetPadding(view As View, left As Int, top As Int, right As Int, bottom As Int)
	Dim r As Reflector
	r.Target = view
	r.RunMethod4("setPadding", Array As Object(left, top, right, bottom), _
        Array As String("java.lang.int", "java.lang.int", "java.lang.int", "java.lang.int"))
End Sub

Public Sub EnableButton(v As View)
	Dim GradButton As GradientDrawable
	Dim Clrs(2) As Int
	Clrs(0) = 0xFF158CC4
	Clrs(1) = 0xFF16406E
	If Not(GradButton.IsInitialized) Then GradButton.Initialize("RIGHT_LEFT", Clrs)
	v.Background = GradButton
	v.Enabled = True
	
	Dim jo As JavaObject = v.Background
	If v.Background Is ColorDrawable Or v.Background Is GradientDrawable Then
		jo.RunMethod("setCornerRadii", Array As Object(Array As Float(25, 25, 25, 25, 25, 25, 25, 25)))
		jo.RunMethod("setStroke", Array As Object(3dip, 0xFFFFFFFF))
	End If
End Sub

Public Sub DisableButton(v As View)
	Dim GradButton As GradientDrawable
	Dim Clrs(2) As Int
	Clrs(0) = 0xFF0099cc
	Clrs(1) = 0xFF7FBDFF
	If Not(GradButton.IsInitialized) Then GradButton.Initialize("TL_BR",Clrs)
	v.Background = GradButton
	v.Enabled = False
	
	Dim jo As JavaObject = v.Background
	If v.Background Is ColorDrawable Or v.Background Is GradientDrawable Then
		jo.RunMethod("setCornerRadii", Array As Object(Array As Float(25, 25, 25, 25, 25, 25, 25, 25)))
		jo.RunMethod("setStroke", Array As Object(3dip, 0xFFFFFFFF))
	End If
End Sub

