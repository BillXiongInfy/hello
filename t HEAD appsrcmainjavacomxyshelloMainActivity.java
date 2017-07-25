[1mdiff --git a/app/src/main/java/com/xys/hello/MainActivity.java b/app/src/main/java/com/xys/hello/MainActivity.java[m
[1mindex 70e84f1..54f4bec 100644[m
[1m--- a/app/src/main/java/com/xys/hello/MainActivity.java[m
[1m+++ b/app/src/main/java/com/xys/hello/MainActivity.java[m
[36m@@ -1,7 +1,10 @@[m
 package com.xys.hello;[m
 [m
[31m-import android.support.v7.app.AppCompatActivity;[m
 import android.os.Bundle;[m
[32m+[m[32mimport android.support.v7.app.AppCompatActivity;[m
[32m+[m[32mimport android.widget.TextView;[m
[32m+[m
[32m+[m[32mimport static com.xys.hello.R.id.text;[m
 [m
 public class MainActivity extends AppCompatActivity {[m
 [m
[36m@@ -9,5 +12,6 @@[m [mpublic class MainActivity extends AppCompatActivity {[m
     protected void onCreate(Bundle savedInstanceState) {[m
         super.onCreate(savedInstanceState);[m
         setContentView(R.layout.activity_main);[m
[32m+[m[32m        TextView findViewById = (TextView)findViewById(text);[m
     }[m
 }[m
[1mdiff --git a/app/src/main/res/layout/activity_main.xml b/app/src/main/res/layout/activity_main.xml[m
[1mindex e86edbe..5015f06 100644[m
[1m--- a/app/src/main/res/layout/activity_main.xml[m
[1m+++ b/app/src/main/res/layout/activity_main.xml[m
[36m@@ -10,6 +10,7 @@[m
     tools:context="com.xys.hello.MainActivity">[m
 [m
     <TextView[m
[32m+[m[32m        android:ID = "abc"[m
         android:layout_width="wrap_content"[m
         android:layout_height="wrap_content"[m
         android:text="Hello World!" />[m
