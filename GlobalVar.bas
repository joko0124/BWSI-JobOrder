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
	Public DBVersion As Int : DBVersion = 1
	Public APIController As String = "ApiController"
	Public BaseURL As String : BaseURL = "https://rcis-dev.bwsi.com.ph/api/"
	Public RequestTokenURL As String : RequestTokenURL = "https://rcis-dev.bwsi.com.ph/oauth/token"
	Public RefreshTokenURL As String : RefreshTokenURL = "https://rcis-dev.bwsi.com.ph/oauth/token"
	
	Public ClientID As String : ClientID = "1"
	Public ClientSecretKey As String : ClientSecretKey = "SWSU335vhTSvDIIPhYD2xeGzQq7kK9fNWoxdt3xt"
	
	Public csTitle, csSubTitle As CSBuilder
	
	Public Font As Typeface = Typeface.LoadFromAssets("myfont.ttf")
	Public FontBold As Typeface = Typeface.LoadFromAssets("myfont_bold.ttf")
	
	Public PriColor = 0xFF0099cc As Double 'primary
	Public SecColor = 0xFF7FBDFF As Double
	
	Public PosColor = 0xFF007BFF As Double
	Public NegColor = 0xFFDC3545 As Double
	Public NeutralColor = 0xFF7FBDFF As Double
	
	Public BlueColor = 0xFF17A2B7 As Double 'info color
	Public GreenColor = 0xFF28A745 As Double 'success color 85ffa1
	Public GreenColor2 = 0xFF188731 As Double 'success color 85ffa1
	Public RedColor = 0xFFDC3545 As Double 'danger color
	Public YellowColor = 0xFFFFC107 As Double 'warning color
	Public GrayColor = 0xFF62789E As Double
	Public YellowColor2 = 0xFFE5B040 As Double 'warning color
	Public SF As StringFunctions

End Sub