package com.bwsi.joborder.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_notifications{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("toolbar").vw.setTop((int)((0d * scale)));
if ((anywheresoftware.b4a.keywords.LayoutBuilder.getScreenSize()>6.5d)) { 
;
views.get("toolbar").vw.setHeight((int)((68d * scale)));
;}else{ 
;
if ((BA.ObjectToBoolean( String.valueOf(anywheresoftware.b4a.keywords.LayoutBuilder.isPortrait())))) { 
;
views.get("toolbar").vw.setHeight((int)((55d * scale)));
;}else{ 
;
views.get("toolbar").vw.setHeight((int)((42d * scale)));
;};
;};
views.get("pnlmain").vw.setTop((int)((views.get("toolbar").vw.getTop() + views.get("toolbar").vw.getHeight())));
views.get("pnlmain").vw.setHeight((int)((100d / 100 * height) - ((views.get("toolbar").vw.getTop() + views.get("toolbar").vw.getHeight()))));
views.get("pnlmain").vw.setLeft((int)((1d / 100 * width)));
views.get("pnlmain").vw.setWidth((int)((99d / 100 * width) - ((1d / 100 * width))));
views.get("pnlsearch").vw.setLeft((int)((1d / 100 * width)));
views.get("pnlsearch").vw.setWidth((int)((views.get("pnlmain").vw.getWidth())-(1d / 100 * width) - ((1d / 100 * width))));
views.get("pnlsearch").vw.setTop((int)((1d / 100 * height)));
views.get("searchicon").vw.setLeft((int)((1d / 100 * width)));
views.get("searchicon").vw.setTop((int)((views.get("pnlsearch").vw.getHeight())/2d - (views.get("searchicon").vw.getHeight() / 2)));
views.get("txtsearch").vw.setLeft((int)((views.get("searchicon").vw.getLeft() + views.get("searchicon").vw.getWidth())+(5d * scale)));
views.get("txtsearch").vw.setWidth((int)((views.get("pnlsearch").vw.getWidth())-(1d / 100 * width) - ((views.get("searchicon").vw.getLeft() + views.get("searchicon").vw.getWidth())+(5d * scale))));
views.get("txtsearch").vw.setTop((int)((views.get("pnlsearch").vw.getHeight())/2d - (views.get("txtsearch").vw.getHeight() / 2)));

}
}