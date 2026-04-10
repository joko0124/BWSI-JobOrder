package com.bwsi.joborder.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_dashboard{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[Dashboard/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 3;BA.debugLine="ToolBar.Top = 0dip"[Dashboard/General script]
views.get("toolbar").vw.setTop((int)((0d * scale)));
//BA.debugLineNum = 5;BA.debugLine="If ActivitySize > 6.5 Then"[Dashboard/General script]
if ((anywheresoftware.b4a.keywords.LayoutBuilder.getScreenSize()>6.5d)) { 
;
//BA.debugLineNum = 6;BA.debugLine="ToolBar.Height = 68dip"[Dashboard/General script]
views.get("toolbar").vw.setHeight((int)((68d * scale)));
//BA.debugLineNum = 7;BA.debugLine="Else"[Dashboard/General script]
;}else{ 
;
//BA.debugLineNum = 8;BA.debugLine="If Portrait Then"[Dashboard/General script]
if ((BA.ObjectToBoolean( String.valueOf(anywheresoftware.b4a.keywords.LayoutBuilder.isPortrait())))) { 
;
//BA.debugLineNum = 9;BA.debugLine="ToolBar.Height = 55dip"[Dashboard/General script]
views.get("toolbar").vw.setHeight((int)((55d * scale)));
//BA.debugLineNum = 10;BA.debugLine="Else"[Dashboard/General script]
;}else{ 
;
//BA.debugLineNum = 11;BA.debugLine="ToolBar.Height = 42dip"[Dashboard/General script]
views.get("toolbar").vw.setHeight((int)((42d * scale)));
//BA.debugLineNum = 12;BA.debugLine="End If"[Dashboard/General script]
;};
//BA.debugLineNum = 13;BA.debugLine="End If"[Dashboard/General script]
;};
//BA.debugLineNum = 15;BA.debugLine="pnlMain.SetTopAndBottom(ToolBar.Bottom, 100%y)"[Dashboard/General script]
views.get("pnlmain").vw.setTop((int)((views.get("toolbar").vw.getTop() + views.get("toolbar").vw.getHeight())));
views.get("pnlmain").vw.setHeight((int)((100d / 100 * height) - ((views.get("toolbar").vw.getTop() + views.get("toolbar").vw.getHeight()))));
//BA.debugLineNum = 16;BA.debugLine="pnlMain.SetLeftAndRight(0%x, 100%x)"[Dashboard/General script]
views.get("pnlmain").vw.setLeft((int)((0d / 100 * width)));
views.get("pnlmain").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 18;BA.debugLine="pnlUserInfo.SetLeftAndRight(0%x, pnlMain.Width)"[Dashboard/General script]
views.get("pnluserinfo").vw.setLeft((int)((0d / 100 * width)));
views.get("pnluserinfo").vw.setWidth((int)((views.get("pnlmain").vw.getWidth()) - ((0d / 100 * width))));
//BA.debugLineNum = 19;BA.debugLine="pnlUserInfo.Top = 0"[Dashboard/General script]
views.get("pnluserinfo").vw.setTop((int)(0d));
//BA.debugLineNum = 21;BA.debugLine="lblEmpName.SetLeftAndRight(5%x, pnlUserInfo.Width - 3%x)"[Dashboard/General script]
views.get("lblempname").vw.setLeft((int)((5d / 100 * width)));
views.get("lblempname").vw.setWidth((int)((views.get("pnluserinfo").vw.getWidth())-(3d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 22;BA.debugLine="lblEmpName.Top = 0.5%y"[Dashboard/General script]
views.get("lblempname").vw.setTop((int)((0.5d / 100 * height)));
//BA.debugLineNum = 24;BA.debugLine="lblBranchName.SetLeftAndRight(5%x, pnlUserInfo.Width - 3%x)"[Dashboard/General script]
views.get("lblbranchname").vw.setLeft((int)((5d / 100 * width)));
views.get("lblbranchname").vw.setWidth((int)((views.get("pnluserinfo").vw.getWidth())-(3d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 25;BA.debugLine="lblBranchName.Top = lblEmpName.Bottom"[Dashboard/General script]
views.get("lblbranchname").vw.setTop((int)((views.get("lblempname").vw.getTop() + views.get("lblempname").vw.getHeight())));
//BA.debugLineNum = 28;BA.debugLine="pnlOnGoing.SetLeftAndRight(1%x, pnlMain.Width - 51%x)"[Dashboard/General script]
views.get("pnlongoing").vw.setLeft((int)((1d / 100 * width)));
views.get("pnlongoing").vw.setWidth((int)((views.get("pnlmain").vw.getWidth())-(51d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 29;BA.debugLine="pnlOnGoing.SetTopAndBottom(pnlUserInfo.Bottom + 10dip, pnlMain.Height - 67%y)"[Dashboard/General script]
views.get("pnlongoing").vw.setTop((int)((views.get("pnluserinfo").vw.getTop() + views.get("pnluserinfo").vw.getHeight())+(10d * scale)));
views.get("pnlongoing").vw.setHeight((int)((views.get("pnlmain").vw.getHeight())-(67d / 100 * height) - ((views.get("pnluserinfo").vw.getTop() + views.get("pnluserinfo").vw.getHeight())+(10d * scale))));
//BA.debugLineNum = 31;BA.debugLine="imgOngoing.Left = 2%x"[Dashboard/General script]
views.get("imgongoing").vw.setLeft((int)((2d / 100 * width)));
//BA.debugLineNum = 32;BA.debugLine="imgOngoing.VerticalCenter = pnlOnGoing.Height / 2"[Dashboard/General script]
views.get("imgongoing").vw.setTop((int)((views.get("pnlongoing").vw.getHeight())/2d - (views.get("imgongoing").vw.getHeight() / 2)));
//BA.debugLineNum = 34;BA.debugLine="lblTitleOngoing.SetLeftAndRight(3%x, pnlOnGoing.Width - 3%x)"[Dashboard/General script]
views.get("lbltitleongoing").vw.setLeft((int)((3d / 100 * width)));
views.get("lbltitleongoing").vw.setWidth((int)((views.get("pnlongoing").vw.getWidth())-(3d / 100 * width) - ((3d / 100 * width))));
//BA.debugLineNum = 35;BA.debugLine="lblTitleOngoing.Top = 1%y"[Dashboard/General script]
views.get("lbltitleongoing").vw.setTop((int)((1d / 100 * height)));
//BA.debugLineNum = 37;BA.debugLine="lblNumOngoing.Left = imgOngoing.Right + 10dip"[Dashboard/General script]
views.get("lblnumongoing").vw.setLeft((int)((views.get("imgongoing").vw.getLeft() + views.get("imgongoing").vw.getWidth())+(10d * scale)));
//BA.debugLineNum = 38;BA.debugLine="lblNumOngoing.VerticalCenter = imgOngoing.VerticalCenter"[Dashboard/General script]
views.get("lblnumongoing").vw.setTop((int)((views.get("imgongoing").vw.getTop() + views.get("imgongoing").vw.getHeight()/2) - (views.get("lblnumongoing").vw.getHeight() / 2)));
//BA.debugLineNum = 40;BA.debugLine="Label1.SetLeftAndRight(imgOngoing.Left, pnlOnGoing.Width - 2%x)"[Dashboard/General script]
views.get("label1").vw.setLeft((int)((views.get("imgongoing").vw.getLeft())));
views.get("label1").vw.setWidth((int)((views.get("pnlongoing").vw.getWidth())-(2d / 100 * width) - ((views.get("imgongoing").vw.getLeft()))));
//BA.debugLineNum = 41;BA.debugLine="Label1.Top = imgOngoing.Bottom"[Dashboard/General script]
views.get("label1").vw.setTop((int)((views.get("imgongoing").vw.getTop() + views.get("imgongoing").vw.getHeight())));
//BA.debugLineNum = 44;BA.debugLine="pnlAccomplished.SetLeftAndRight(51%x, pnlMain.Width- 1%x)"[Dashboard/General script]
views.get("pnlaccomplished").vw.setLeft((int)((51d / 100 * width)));
views.get("pnlaccomplished").vw.setWidth((int)((views.get("pnlmain").vw.getWidth())-(1d / 100 * width) - ((51d / 100 * width))));
//BA.debugLineNum = 45;BA.debugLine="pnlAccomplished.SetTopAndBottom(pnlUserInfo.Bottom + 10dip, pnlMain.Height - 67%y)"[Dashboard/General script]
views.get("pnlaccomplished").vw.setTop((int)((views.get("pnluserinfo").vw.getTop() + views.get("pnluserinfo").vw.getHeight())+(10d * scale)));
views.get("pnlaccomplished").vw.setHeight((int)((views.get("pnlmain").vw.getHeight())-(67d / 100 * height) - ((views.get("pnluserinfo").vw.getTop() + views.get("pnluserinfo").vw.getHeight())+(10d * scale))));
//BA.debugLineNum = 47;BA.debugLine="imgAccomplished.Left = 2%x"[Dashboard/General script]
views.get("imgaccomplished").vw.setLeft((int)((2d / 100 * width)));
//BA.debugLineNum = 48;BA.debugLine="imgAccomplished.VerticalCenter = pnlAccomplished.Height / 2"[Dashboard/General script]
views.get("imgaccomplished").vw.setTop((int)((views.get("pnlaccomplished").vw.getHeight())/2d - (views.get("imgaccomplished").vw.getHeight() / 2)));
//BA.debugLineNum = 50;BA.debugLine="lblTitleAccomplished.SetLeftAndRight(3%x, pnlAccomplished.Width - 3%x)"[Dashboard/General script]
views.get("lbltitleaccomplished").vw.setLeft((int)((3d / 100 * width)));
views.get("lbltitleaccomplished").vw.setWidth((int)((views.get("pnlaccomplished").vw.getWidth())-(3d / 100 * width) - ((3d / 100 * width))));
//BA.debugLineNum = 51;BA.debugLine="lblTitleAccomplished.Top = 1%y"[Dashboard/General script]
views.get("lbltitleaccomplished").vw.setTop((int)((1d / 100 * height)));
//BA.debugLineNum = 53;BA.debugLine="lblNumAccomplished.Left = imgAccomplished.Right + 10dip"[Dashboard/General script]
views.get("lblnumaccomplished").vw.setLeft((int)((views.get("imgaccomplished").vw.getLeft() + views.get("imgaccomplished").vw.getWidth())+(10d * scale)));
//BA.debugLineNum = 54;BA.debugLine="lblNumAccomplished.VerticalCenter = imgAccomplished.VerticalCenter"[Dashboard/General script]
views.get("lblnumaccomplished").vw.setTop((int)((views.get("imgaccomplished").vw.getTop() + views.get("imgaccomplished").vw.getHeight()/2) - (views.get("lblnumaccomplished").vw.getHeight() / 2)));
//BA.debugLineNum = 56;BA.debugLine="Label2.SetLeftAndRight(imgAccomplished.Left, pnlAccomplished.Width - 2%x)"[Dashboard/General script]
views.get("label2").vw.setLeft((int)((views.get("imgaccomplished").vw.getLeft())));
views.get("label2").vw.setWidth((int)((views.get("pnlaccomplished").vw.getWidth())-(2d / 100 * width) - ((views.get("imgaccomplished").vw.getLeft()))));
//BA.debugLineNum = 57;BA.debugLine="Label2.Top = imgAccomplished.Bottom"[Dashboard/General script]
views.get("label2").vw.setTop((int)((views.get("imgaccomplished").vw.getTop() + views.get("imgaccomplished").vw.getHeight())));
//BA.debugLineNum = 60;BA.debugLine="pnlPending.SetLeftAndRight(1%x, pnlMain.Width - 51%x)"[Dashboard/General script]
views.get("pnlpending").vw.setLeft((int)((1d / 100 * width)));
views.get("pnlpending").vw.setWidth((int)((views.get("pnlmain").vw.getWidth())-(51d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 61;BA.debugLine="pnlPending.Height = pnlOnGoing.Height"[Dashboard/General script]
views.get("pnlpending").vw.setHeight((int)((views.get("pnlongoing").vw.getHeight())));
//BA.debugLineNum = 62;BA.debugLine="pnlPending.Top = pnlOnGoing.Bottom + 1%y"[Dashboard/General script]
views.get("pnlpending").vw.setTop((int)((views.get("pnlongoing").vw.getTop() + views.get("pnlongoing").vw.getHeight())+(1d / 100 * height)));
//BA.debugLineNum = 64;BA.debugLine="imgPending.Left = 2%x"[Dashboard/General script]
views.get("imgpending").vw.setLeft((int)((2d / 100 * width)));
//BA.debugLineNum = 65;BA.debugLine="imgPending.VerticalCenter = pnlPending.Height / 2"[Dashboard/General script]
views.get("imgpending").vw.setTop((int)((views.get("pnlpending").vw.getHeight())/2d - (views.get("imgpending").vw.getHeight() / 2)));
//BA.debugLineNum = 67;BA.debugLine="lblTitlePending.SetLeftAndRight(3%x, pnlPending.Width - 3%x)"[Dashboard/General script]
views.get("lbltitlepending").vw.setLeft((int)((3d / 100 * width)));
views.get("lbltitlepending").vw.setWidth((int)((views.get("pnlpending").vw.getWidth())-(3d / 100 * width) - ((3d / 100 * width))));
//BA.debugLineNum = 68;BA.debugLine="lblTitlePending.Top = 1%y"[Dashboard/General script]
views.get("lbltitlepending").vw.setTop((int)((1d / 100 * height)));
//BA.debugLineNum = 70;BA.debugLine="lblNumPending.Left = imgPending.Right + 10dip"[Dashboard/General script]
views.get("lblnumpending").vw.setLeft((int)((views.get("imgpending").vw.getLeft() + views.get("imgpending").vw.getWidth())+(10d * scale)));
//BA.debugLineNum = 71;BA.debugLine="lblNumPending.VerticalCenter = imgPending.VerticalCenter"[Dashboard/General script]
views.get("lblnumpending").vw.setTop((int)((views.get("imgpending").vw.getTop() + views.get("imgpending").vw.getHeight()/2) - (views.get("lblnumpending").vw.getHeight() / 2)));
//BA.debugLineNum = 73;BA.debugLine="Label3.SetLeftAndRight(1%x, pnlPending.Width - 1%x)"[Dashboard/General script]
views.get("label3").vw.setLeft((int)((1d / 100 * width)));
views.get("label3").vw.setWidth((int)((views.get("pnlpending").vw.getWidth())-(1d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 74;BA.debugLine="Label3.Top = imgPending.Bottom"[Dashboard/General script]
views.get("label3").vw.setTop((int)((views.get("imgpending").vw.getTop() + views.get("imgpending").vw.getHeight())));
//BA.debugLineNum = 77;BA.debugLine="pnlCancelled.SetLeftAndRight(51%x, pnlMain.Width- 1%x)"[Dashboard/General script]
views.get("pnlcancelled").vw.setLeft((int)((51d / 100 * width)));
views.get("pnlcancelled").vw.setWidth((int)((views.get("pnlmain").vw.getWidth())-(1d / 100 * width) - ((51d / 100 * width))));
//BA.debugLineNum = 78;BA.debugLine="pnlCancelled.Height = pnlAccomplished.Height"[Dashboard/General script]
views.get("pnlcancelled").vw.setHeight((int)((views.get("pnlaccomplished").vw.getHeight())));
//BA.debugLineNum = 79;BA.debugLine="pnlCancelled.Top = pnlAccomplished.Bottom + 1%y"[Dashboard/General script]
views.get("pnlcancelled").vw.setTop((int)((views.get("pnlaccomplished").vw.getTop() + views.get("pnlaccomplished").vw.getHeight())+(1d / 100 * height)));
//BA.debugLineNum = 81;BA.debugLine="imgCancelled.Left = 2%x"[Dashboard/General script]
views.get("imgcancelled").vw.setLeft((int)((2d / 100 * width)));
//BA.debugLineNum = 82;BA.debugLine="imgCancelled.VerticalCenter = pnlCancelled.Height / 2"[Dashboard/General script]
views.get("imgcancelled").vw.setTop((int)((views.get("pnlcancelled").vw.getHeight())/2d - (views.get("imgcancelled").vw.getHeight() / 2)));
//BA.debugLineNum = 84;BA.debugLine="lblTitleCancelled.SetLeftAndRight(3%x, pnlCancelled.Width - 3%x)"[Dashboard/General script]
views.get("lbltitlecancelled").vw.setLeft((int)((3d / 100 * width)));
views.get("lbltitlecancelled").vw.setWidth((int)((views.get("pnlcancelled").vw.getWidth())-(3d / 100 * width) - ((3d / 100 * width))));
//BA.debugLineNum = 85;BA.debugLine="lblTitleCancelled.Top = 1%y"[Dashboard/General script]
views.get("lbltitlecancelled").vw.setTop((int)((1d / 100 * height)));
//BA.debugLineNum = 87;BA.debugLine="lblNumCancelled.Left = imgCancelled.Right + 10dip"[Dashboard/General script]
views.get("lblnumcancelled").vw.setLeft((int)((views.get("imgcancelled").vw.getLeft() + views.get("imgcancelled").vw.getWidth())+(10d * scale)));
//BA.debugLineNum = 88;BA.debugLine="lblNumCancelled.VerticalCenter = imgCancelled.VerticalCenter"[Dashboard/General script]
views.get("lblnumcancelled").vw.setTop((int)((views.get("imgcancelled").vw.getTop() + views.get("imgcancelled").vw.getHeight()/2) - (views.get("lblnumcancelled").vw.getHeight() / 2)));
//BA.debugLineNum = 90;BA.debugLine="Label4.SetLeftAndRight(1%x, pnlCancelled.Width - 1%x)"[Dashboard/General script]
views.get("label4").vw.setLeft((int)((1d / 100 * width)));
views.get("label4").vw.setWidth((int)((views.get("pnlcancelled").vw.getWidth())-(1d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 91;BA.debugLine="Label4.Top = imgCancelled.Bottom"[Dashboard/General script]
views.get("label4").vw.setTop((int)((views.get("imgcancelled").vw.getTop() + views.get("imgcancelled").vw.getHeight())));
//BA.debugLineNum = 94;BA.debugLine="pnlJOList.SetLeftAndRight(2%x, pnlMain.Width - 2%x)"[Dashboard/General script]
views.get("pnljolist").vw.setLeft((int)((2d / 100 * width)));
views.get("pnljolist").vw.setWidth((int)((views.get("pnlmain").vw.getWidth())-(2d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 95;BA.debugLine="pnlJOList.SetTopAndBottom(pnlPending.Bottom + 15dip, pnlMain.Height - 12%y)"[Dashboard/General script]
views.get("pnljolist").vw.setTop((int)((views.get("pnlpending").vw.getTop() + views.get("pnlpending").vw.getHeight())+(15d * scale)));
views.get("pnljolist").vw.setHeight((int)((views.get("pnlmain").vw.getHeight())-(12d / 100 * height) - ((views.get("pnlpending").vw.getTop() + views.get("pnlpending").vw.getHeight())+(15d * scale))));
//BA.debugLineNum = 97;BA.debugLine="btnSyncJO.SetLeftAndRight(2%x, pnlMain.Width - 2%x)"[Dashboard/General script]
views.get("btnsyncjo").vw.setLeft((int)((2d / 100 * width)));
views.get("btnsyncjo").vw.setWidth((int)((views.get("pnlmain").vw.getWidth())-(2d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 98;BA.debugLine="btnSyncJO.SetTopAndBottom(pnlJOList.Bottom + 5dip, pnlMain.Height - 1%y)"[Dashboard/General script]
views.get("btnsyncjo").vw.setTop((int)((views.get("pnljolist").vw.getTop() + views.get("pnljolist").vw.getHeight())+(5d * scale)));
views.get("btnsyncjo").vw.setHeight((int)((views.get("pnlmain").vw.getHeight())-(1d / 100 * height) - ((views.get("pnljolist").vw.getTop() + views.get("pnljolist").vw.getHeight())+(5d * scale))));

}
}