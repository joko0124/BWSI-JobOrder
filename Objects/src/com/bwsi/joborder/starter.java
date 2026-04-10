package com.bwsi.joborder;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class starter extends  android.app.Service{
	public static class starter_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (starter) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, starter.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, true, BA.class);
		}

	}
    static starter mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return starter.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new BA(this, null, null, "com.bwsi.joborder", "com.bwsi.joborder.starter");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
            ServiceHelper.init();
        }
        _service = new ServiceHelper(this);
        processBA.service = this;
        
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "com.bwsi.joborder.starter", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!true && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (starter) Create ***");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (true) {
			ServiceHelper.StarterHelper.runWaitForLayouts();
		}
    }
		@Override
	public void onStart(android.content.Intent intent, int startId) {
		onStartCommand(intent, 0, 0);
    }
    @Override
    public int onStartCommand(final android.content.Intent intent, int flags, int startId) {
    	if (ServiceHelper.StarterHelper.onStartCommand(processBA, new Runnable() {
            public void run() {
                handleStart(intent);
            }}))
			;
		else {
			ServiceHelper.StarterHelper.addWaitForLayout (new Runnable() {
				public void run() {
                    processBA.setActivityPaused(false);
                    BA.LogInfo("** Service (starter) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
                    ServiceHelper.StarterHelper.removeWaitForLayout();
				}
			});
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_NOT_STICKY;
    }
    public void onTaskRemoved(android.content.Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        if (true)
            processBA.raiseEvent(null, "service_taskremoved");
            
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (starter) Start **");
    	java.lang.reflect.Method startEvent = processBA.htSubs.get("service_start");
    	if (startEvent != null) {
    		if (startEvent.getParameterTypes().length > 0) {
    			anywheresoftware.b4a.objects.IntentWrapper iw = ServiceHelper.StarterHelper.handleStartIntent(intent, _service, processBA);
    			processBA.raiseEvent(null, "service_start", iw);
    		}
    		else {
    			processBA.raiseEvent(null, "service_start");
    		}
    	}
    }
	
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (true) {
            BA.LogInfo("** Service (starter) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (starter) Destroy **");
		    processBA.raiseEvent(null, "service_destroy");
            processBA.service = null;
		    mostCurrent = null;
		    processBA.setActivityPaused(true);
            processBA.runHook("ondestroy", this, null);
        }
	}

@Override
	public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
	}public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.sql.SQL _dbcon = null;
public static String _strcriteria = "";
public static String _dbpath = "";
public static anywheresoftware.b4a.objects.RuntimePermissions _rtp = null;
public static String _safedirectory = "";
public static String _dbname = "";
public static anywheresoftware.b4a.gps.GPS _gps1 = null;
public static boolean _gpsstarted = false;
public static uk.co.martinpearman.b4a.fusedlocationprovider.FusedLocationProviderWrapper _flp = null;
public static boolean _flpstarted = false;
public static anywheresoftware.b4a.keywords.StringBuilderWrapper _logs = null;
public static anywheresoftware.b4a.phone.Phone.LogCat _logcat = null;
public static boolean _appcrashed = false;
public b4a.example.dateutils _dateutils = null;
public com.bwsi.joborder.main _main = null;
public com.bwsi.joborder.camera _camera = null;
public com.bwsi.joborder.mainscreen _mainscreen = null;
public com.bwsi.joborder.globalvar _globalvar = null;
public com.bwsi.joborder.notif _notif = null;
public com.bwsi.joborder.misc _misc = null;
public com.bwsi.joborder.dbutils _dbutils = null;
public com.bwsi.joborder.httputils2service _httputils2service = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
 //BA.debugLineNum = 66;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return false;
}
public static String  _connecttodatabase() throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Public Sub ConnectToDatabase";
 //BA.debugLineNum = 76;BA.debugLine="If DBCon.IsInitialized = False Then";
if (_dbcon.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 77;BA.debugLine="DBCon.Initialize(SafeDirectory, DBName, False)";
_dbcon.Initialize(_safedirectory,_dbname,anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 79;BA.debugLine="DBCon.Initialize(SafeDirectory, DBName, False)";
_dbcon.Initialize(_safedirectory,_dbname,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public static String  _gps_gpsstatus(anywheresoftware.b4a.objects.collections.List _satellites) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub GPS_GpsStatus (Satellites As List)";
 //BA.debugLineNum = 102;BA.debugLine="CallSub2(Main, \"GPSStatus\", Satellites)";
anywheresoftware.b4a.keywords.Common.CallSubNew2(processBA,(Object)(mostCurrent._main.getObject()),"GPSStatus",(Object)(_satellites));
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public static String  _gps_locationchanged(anywheresoftware.b4a.gps.LocationWrapper _location1) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub GPS_LocationChanged (Location1 As Location)";
 //BA.debugLineNum = 98;BA.debugLine="CallSub2(Main, \"LocationChanged\", Location1)";
anywheresoftware.b4a.keywords.Common.CallSubNew2(processBA,(Object)(mostCurrent._main.getObject()),"LocationChanged",(Object)(_location1));
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Public DBCon As SQL";
_dbcon = new anywheresoftware.b4a.sql.SQL();
 //BA.debugLineNum = 10;BA.debugLine="Public strCriteria As String";
_strcriteria = "";
 //BA.debugLineNum = 11;BA.debugLine="Public DBPath As String";
_dbpath = "";
 //BA.debugLineNum = 12;BA.debugLine="Public RTP As RuntimePermissions";
_rtp = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 14;BA.debugLine="Public SafeDirectory As String";
_safedirectory = "";
 //BA.debugLineNum = 15;BA.debugLine="Public DBName As String = \"MasterDB.db\"";
_dbname = "MasterDB.db";
 //BA.debugLineNum = 17;BA.debugLine="Public GPS1 As GPS";
_gps1 = new anywheresoftware.b4a.gps.GPS();
 //BA.debugLineNum = 18;BA.debugLine="Private GPSStarted As Boolean";
_gpsstarted = false;
 //BA.debugLineNum = 20;BA.debugLine="Public FLP As FusedLocationProvider";
_flp = new uk.co.martinpearman.b4a.fusedlocationprovider.FusedLocationProviderWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private flpStarted As Boolean";
_flpstarted = false;
 //BA.debugLineNum = 23;BA.debugLine="Private logs As StringBuilder";
_logs = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private logcat As LogCat";
_logcat = new anywheresoftware.b4a.phone.Phone.LogCat();
 //BA.debugLineNum = 25;BA.debugLine="Dim appCrashed As Boolean";
_appcrashed = false;
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public static void  _service_create() throws Exception{
ResumableSub_Service_Create rsub = new ResumableSub_Service_Create(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Service_Create extends BA.ResumableSub {
public ResumableSub_Service_Create(com.bwsi.joborder.starter parent) {
this.parent = parent;
}
com.bwsi.joborder.starter parent;
anywheresoftware.b4j.object.JavaObject _jo = null;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 31;BA.debugLine="Log(RTP.GetSafeDirDefaultExternal(\"\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("4393219",parent._rtp.GetSafeDirDefaultExternal(""),0);
 //BA.debugLineNum = 32;BA.debugLine="DBPath = DBUtils.CopyDBFromAssets(\"MasterDB.db\")";
parent._dbpath = parent.mostCurrent._dbutils._copydbfromassets /*String*/ (processBA,"MasterDB.db");
 //BA.debugLineNum = 34;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 35;BA.debugLine="If jo.IsInitialized = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_jo.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 36;BA.debugLine="jo.InitializeStatic(\"java.util.Locale\").RunMetho";
_jo.InitializeStatic("java.util.Locale").RunMethod("setDefault",new Object[]{_jo.GetField("US")});
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 39;BA.debugLine="SafeDirectory = RTP.GetSafeDirDefaultExternal(\"\")";
parent._safedirectory = parent._rtp.GetSafeDirDefaultExternal("");
 //BA.debugLineNum = 41;BA.debugLine="If File.Exists(SafeDirectory, DBName) = False The";
if (true) break;

case 5:
//if
this.state = 8;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent._safedirectory,parent._dbname)==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 42;BA.debugLine="Wait For (File.CopyAsync(File.DirAssets, DBName,";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, anywheresoftware.b4a.keywords.Common.File.CopyAsync(processBA,anywheresoftware.b4a.keywords.Common.File.getDirAssets(),parent._dbname,parent._safedirectory,parent._dbname));
this.state = 9;
return;
case 9:
//C
this.state = 8;
_success = (Boolean) result[0];
;
 //BA.debugLineNum = 43;BA.debugLine="ToastMessageShow($\"DB Copied = ${Success}\"$, Fal";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(("DB Copied = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_success))+"")),anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 8:
//C
this.state = -1;
;
 //BA.debugLineNum = 46;BA.debugLine="appCrashed = False";
parent._appcrashed = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _complete(boolean _success) throws Exception{
}
public static String  _service_destroy() throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub Service_Destroy";
 //BA.debugLineNum = 70;BA.debugLine="StopGps";
_stopgps();
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
 //BA.debugLineNum = 50;BA.debugLine="Service.StopAutomaticForeground 'Starter service";
mostCurrent._service.StopAutomaticForeground();
 //BA.debugLineNum = 51;BA.debugLine="If File.Exists(File.DirRootExternal,\"exitapp.log\"";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirRootExternal(),"exitapp.log")) { 
 //BA.debugLineNum = 52;BA.debugLine="LogColor(\"GESTURE ERROR WITH SEND EMAIL RESTAT A";
anywheresoftware.b4a.keywords.Common.LogImpl("4458755","GESTURE ERROR WITH SEND EMAIL RESTAT APP",anywheresoftware.b4a.keywords.Common.Colors.Yellow);
 //BA.debugLineNum = 53;BA.debugLine="File.Delete(File.DirRootExternal,\"exitapp.log\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirRootExternal(),"exitapp.log");
 //BA.debugLineNum = 54;BA.debugLine="StopService(Me)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,starter.getObject());
 //BA.debugLineNum = 55;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 //BA.debugLineNum = 56;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public static String  _service_taskremoved() throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub Service_TaskRemoved";
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public static String  _startgps() throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Public Sub StartGps";
 //BA.debugLineNum = 84;BA.debugLine="If GPSStarted = False Then";
if (_gpsstarted==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 85;BA.debugLine="GPS1.Start(0, 0)";
_gps1.Start(processBA,(long) (0),(float) (0));
 //BA.debugLineNum = 86;BA.debugLine="GPSStarted = True";
_gpsstarted = anywheresoftware.b4a.keywords.Common.True;
 };
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public static String  _stopgps() throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Public Sub StopGps";
 //BA.debugLineNum = 91;BA.debugLine="If GPSStarted Then";
if (_gpsstarted) { 
 //BA.debugLineNum = 92;BA.debugLine="GPS1.Stop";
_gps1.Stop();
 //BA.debugLineNum = 93;BA.debugLine="GPSStarted = False";
_gpsstarted = anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
}
