package com.bwsi.joborder.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_login{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("pnlsplash").vw.setLeft((int)(0d));
views.get("pnlsplash").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("pnlsplash").vw.setTop((int)(0d));
views.get("pnlsplash").vw.setHeight((int)((100d / 100 * height) - (0d)));
views.get("imglogo").vw.setLeft((int)((50d / 100 * width) - (views.get("imglogo").vw.getWidth() / 2)));
views.get("imglogo").vw.setTop((int)((50d / 100 * height) - (views.get("imglogo").vw.getHeight() / 2)));
views.get("pnlmainlogin").vw.setLeft((int)((5d / 100 * width)));
views.get("pnlmainlogin").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("pnlmainlogin").vw.setTop((int)((15d / 100 * height)));
views.get("pnlicon").vw.setLeft((int)((views.get("pnlmainlogin").vw.getLeft() + views.get("pnlmainlogin").vw.getWidth()/2) - (views.get("pnlicon").vw.getWidth() / 2)));
views.get("pnlicon").vw.setTop((int)((views.get("pnlmainlogin").vw.getTop()) - (views.get("pnlicon").vw.getHeight() / 2)));
views.get("bwsilogo").vw.setTop((int)((8d / 100 * height)));
views.get("bwsilogo").vw.setLeft((int)((views.get("pnlmainlogin").vw.getWidth())/2d - (views.get("bwsilogo").vw.getWidth() / 2)));
views.get("title").vw.setTop((int)((views.get("bwsilogo").vw.getTop() + views.get("bwsilogo").vw.getHeight())));
views.get("title").vw.setLeft((int)((views.get("pnlmainlogin").vw.getWidth())/2d - (views.get("title").vw.getWidth() / 2)));
views.get("emailanchor").vw.setTop((int)((views.get("title").vw.getTop() + views.get("title").vw.getHeight())+(10d * scale)));
views.get("emailanchor").vw.setLeft((int)((5d / 100 * width)));
views.get("emailanchor").vw.setWidth((int)((views.get("pnlmainlogin").vw.getWidth())-(5d / 100 * width) - ((5d / 100 * width))));
views.get("emailicon").vw.setLeft((int)((2d / 100 * width)));
views.get("emailicon").vw.setTop((int)((views.get("emailanchor").vw.getHeight())/2d - (views.get("emailicon").vw.getHeight() / 2)));
views.get("txtemail").vw.setLeft((int)((views.get("emailicon").vw.getLeft() + views.get("emailicon").vw.getWidth())+(5d * scale)));
views.get("txtemail").vw.setWidth((int)((views.get("emailanchor").vw.getWidth())-(3d / 100 * width) - ((views.get("emailicon").vw.getLeft() + views.get("emailicon").vw.getWidth())+(5d * scale))));
views.get("txtemail").vw.setTop((int)((0.5d / 100 * height)));
views.get("txtemail").vw.setHeight((int)((views.get("emailanchor").vw.getHeight())-(0.5d / 100 * height) - ((0.5d / 100 * height))));
views.get("passwordanchor").vw.setTop((int)((views.get("emailanchor").vw.getTop() + views.get("emailanchor").vw.getHeight())+(10d * scale)));
views.get("passwordanchor").vw.setLeft((int)((5d / 100 * width)));
views.get("passwordanchor").vw.setWidth((int)((views.get("pnlmainlogin").vw.getWidth())-(5d / 100 * width) - ((5d / 100 * width))));
views.get("passwordicon").vw.setLeft((int)((2d / 100 * width)));
views.get("passwordicon").vw.setTop((int)((views.get("passwordanchor").vw.getHeight())/2d - (views.get("passwordicon").vw.getHeight() / 2)));
views.get("txtpassword").vw.setLeft((int)((views.get("passwordicon").vw.getLeft() + views.get("passwordicon").vw.getWidth())+(5d * scale)));
views.get("txtpassword").vw.setWidth((int)((views.get("passwordanchor").vw.getWidth())-(3d / 100 * width) - ((views.get("passwordicon").vw.getLeft() + views.get("passwordicon").vw.getWidth())+(5d * scale))));
views.get("txtpassword").vw.setTop((int)((0.5d / 100 * height)));
views.get("txtpassword").vw.setHeight((int)((views.get("passwordanchor").vw.getHeight())-(0.5d / 100 * height) - ((0.5d / 100 * height))));
views.get("btnlogin").vw.setLeft((int)((5d / 100 * width)));
views.get("btnlogin").vw.setWidth((int)((views.get("pnlmainlogin").vw.getWidth())-(5d / 100 * width) - ((5d / 100 * width))));
views.get("btnlogin").vw.setTop((int)((views.get("passwordanchor").vw.getTop() + views.get("passwordanchor").vw.getHeight())+(25d * scale)));

}
}