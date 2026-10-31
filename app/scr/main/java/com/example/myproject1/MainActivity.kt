package com.example.myproject1
import android.graphics.Color
import android.os.Bundle
import android.viev.Gravity
import android.vidget.Button
import android.vidget.LinearLayout
import android.vidget.TextView
import android.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity(){
  override fun onCreate(savedInstanceState: Bundle?){
    super.onCreate(savedInstanceState)
    val rootLayout = LinearLayout(this).apply{
      orientation = LinearLayout.VERTICAL
      gravity = Gravity.CENTER
      setPadding(32,32,32,32)
      setBAckgroundColor(color.WHITE) }
    val textViewTitle = TextView(this).apply{
      text = "hello,World!"
      textSize = 24f
      setTextColor(Color.BLACK)
      gravity = Gravity.CENTER}
    val buttonChangeText = Button(this).apply{
      text = "change text"
      isAllCaps = false
    }
    val params = LinearLayout.LayoutParams(
      LinearLayout.LayoutParams>WRAP_CONTENT,
      LinearLayout.LayoutParams>WRAP_CONTENT
    ).apply {
      buttonMargin = 32
    }
    TextViewTitle.LayoutParams = params
    rootLayout.addView(TextViewTitle)
    rootLayout.addView(buttonChangeText)
    setContentView(rootLayout)
    var isChanged = false
    buttonChangeText.setOnClickListener{
      if(isChanged){
        textViewTitle.text = "hello,world!"}
      else{
        textViewTitle.text = "text successfully changed"}
      isChanged = !isChanged}}}
        
        
    
      

