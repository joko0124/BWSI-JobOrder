package com.bwsi.joborder;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class misc {
private static misc mostCurrent = new misc();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.dateutils _dateutils = null;
public com.bwsi.joborder.main _main = null;
public com.bwsi.joborder.starter _starter = null;
public com.bwsi.joborder.camera _camera = null;
public com.bwsi.joborder.mainscreen _mainscreen = null;
public com.bwsi.joborder.globalvar _globalvar = null;
public com.bwsi.joborder.notif _notif = null;
public com.bwsi.joborder.dbutils _dbutils = null;
public com.bwsi.joborder.httputils2service _httputils2service = null;
public static String  _disablebutton(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ConcreteViewWrapper _v) throws Exception{
anywheresoftware.b4a.objects.drawable.GradientDrawable _gradbutton = null;
int[] _clrs = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 48;BA.debugLine="Public Sub DisableButton(v As View)";
 //BA.debugLineNum = 49;BA.debugLine="Dim GradButton As GradientDrawable";
_gradbutton = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
 //BA.debugLineNum = 50;BA.debugLine="Dim Clrs(2) As Int";
_clrs = new int[(int) (2)];
;
 //BA.debugLineNum = 51;BA.debugLine="Clrs(0) = 0xFF0099cc";
_clrs[(int) (0)] = (int) (0xff0099cc);
 //BA.debugLineNum = 52;BA.debugLine="Clrs(1) = 0xFF7FBDFF";
_clrs[(int) (1)] = (int) (0xff7fbdff);
 //BA.debugLineNum = 53;BA.debugLine="If Not(GradButton.IsInitialized) Then GradButton.";
if (anywheresoftware.b4a.keywords.Common.Not(_gradbutton.IsInitialized())) { 
_gradbutton.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TL_BR"),_clrs);};
 //BA.debugLineNum = 54;BA.debugLine="v.Background = GradButton";
_v.setBackground((android.graphics.drawable.Drawable)(_gradbutton.getObject()));
 //BA.debugLineNum = 55;BA.debugLine="v.Enabled = False";
_v.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 57;BA.debugLine="Dim jo As JavaObject = v.Background";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_v.getBackground()));
 //BA.debugLineNum = 58;BA.debugLine="If v.Background Is ColorDrawable Or v.Background";
if (_v.getBackground() instanceof android.graphics.drawable.Drawable || _v.getBackground() instanceof android.graphics.drawable.GradientDrawable) { 
 //BA.debugLineNum = 59;BA.debugLine="jo.RunMethod(\"setCornerRadii\", Array As Object(A";
_jo.RunMethod("setCornerRadii",new Object[]{(Object)(new float[]{(float) (25),(float) (25),(float) (25),(float) (25),(float) (25),(float) (25),(float) (25),(float) (25)})});
 //BA.debugLineNum = 60;BA.debugLine="jo.RunMethod(\"setStroke\", Array As Object(3dip,";
_jo.RunMethod("setStroke",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3))),(Object)(0xffffffff)});
 };
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public static String  _enablebutton(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ConcreteViewWrapper _v) throws Exception{
anywheresoftware.b4a.objects.drawable.GradientDrawable _gradbutton = null;
int[] _clrs = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 32;BA.debugLine="Public Sub EnableButton(v As View)";
 //BA.debugLineNum = 33;BA.debugLine="Dim GradButton As GradientDrawable";
_gradbutton = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
 //BA.debugLineNum = 34;BA.debugLine="Dim Clrs(2) As Int";
_clrs = new int[(int) (2)];
;
 //BA.debugLineNum = 35;BA.debugLine="Clrs(0) = 0xFF158CC4";
_clrs[(int) (0)] = (int) (0xff158cc4);
 //BA.debugLineNum = 36;BA.debugLine="Clrs(1) = 0xFF16406E";
_clrs[(int) (1)] = (int) (0xff16406e);
 //BA.debugLineNum = 37;BA.debugLine="If Not(GradButton.IsInitialized) Then GradButton.";
if (anywheresoftware.b4a.keywords.Common.Not(_gradbutton.IsInitialized())) { 
_gradbutton.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"RIGHT_LEFT"),_clrs);};
 //BA.debugLineNum = 38;BA.debugLine="v.Background = GradButton";
_v.setBackground((android.graphics.drawable.Drawable)(_gradbutton.getObject()));
 //BA.debugLineNum = 39;BA.debugLine="v.Enabled = True";
_v.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 41;BA.debugLine="Dim jo As JavaObject = v.Background";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_v.getBackground()));
 //BA.debugLineNum = 42;BA.debugLine="If v.Background Is ColorDrawable Or v.Background";
if (_v.getBackground() instanceof android.graphics.drawable.Drawable || _v.getBackground() instanceof android.graphics.drawable.GradientDrawable) { 
 //BA.debugLineNum = 43;BA.debugLine="jo.RunMethod(\"setCornerRadii\", Array As Object(A";
_jo.RunMethod("setCornerRadii",new Object[]{(Object)(new float[]{(float) (25),(float) (25),(float) (25),(float) (25),(float) (25),(float) (25),(float) (25),(float) (25)})});
 //BA.debugLineNum = 44;BA.debugLine="jo.RunMethod(\"setStroke\", Array As Object(3dip,";
_jo.RunMethod("setStroke",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3))),(Object)(0xffffffff)});
 };
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public static String  _setpadding(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ConcreteViewWrapper _view,int _left,int _top,int _right,int _bottom) throws Exception{
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
 //BA.debugLineNum = 25;BA.debugLine="Public Sub SetPadding(view As View, left As Int, t";
 //BA.debugLineNum = 26;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
 //BA.debugLineNum = 27;BA.debugLine="r.Target = view";
_r.Target = (Object)(_view.getObject());
 //BA.debugLineNum = 28;BA.debugLine="r.RunMethod4(\"setPadding\", Array As Object(left,";
_r.RunMethod4("setPadding",new Object[]{(Object)(_left),(Object)(_top),(Object)(_right),(Object)(_bottom)},new String[]{"java.lang.int","java.lang.int","java.lang.int","java.lang.int"});
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public static String  _setstatusbarandnavigationcolor(anywheresoftware.b4a.BA _ba,int _clr) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _window = null;
anywheresoftware.b4j.object.JavaObject _jo2 = null;
 //BA.debugLineNum = 9;BA.debugLine="Public Sub SetStatusBarAndNavigationColor(clr As I";
 //BA.debugLineNum = 10;BA.debugLine="Try";
try { //BA.debugLineNum = 11;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 12;BA.debugLine="jo.InitializeContext";
_jo.InitializeContext((_ba.processBA == null ? _ba : _ba.processBA));
 //BA.debugLineNum = 13;BA.debugLine="Dim window As JavaObject = jo.RunMethodJO(\"getWi";
_window = new anywheresoftware.b4j.object.JavaObject();
_window = _jo.RunMethodJO("getWindow",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 14;BA.debugLine="window.RunMethod(\"addFlags\", Array (0x80000000))";
_window.RunMethod("addFlags",new Object[]{(Object)(0x80000000)});
 //BA.debugLineNum = 15;BA.debugLine="window.RunMethod(\"clearFlags\", Array (0x04000000";
_window.RunMethod("clearFlags",new Object[]{(Object)(0x04000000)});
 //BA.debugLineNum = 16;BA.debugLine="window.RunMethod(\"setStatusBarColor\", Array(clr)";
_window.RunMethod("setStatusBarColor",new Object[]{(Object)(_clr)});
 //BA.debugLineNum = 17;BA.debugLine="Dim jo2 As JavaObject";
_jo2 = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 18;BA.debugLine="jo2.InitializeContext";
_jo2.InitializeContext((_ba.processBA == null ? _ba : _ba.processBA));
 //BA.debugLineNum = 19;BA.debugLine="jo2.RunMethodJO(\"getWindow\", Null).RunMethod(\"se";
_jo2.RunMethodJO("getWindow",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).RunMethod("setNavigationBarColor",new Object[]{(Object)(_clr)});
 } 
       catch (Exception e12) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e12); //BA.debugLineNum = 21;BA.debugLine="ToastMessageShow(\"Some error with your android v";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Some error with your android version ( <5 )"),anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
}
