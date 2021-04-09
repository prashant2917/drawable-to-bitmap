# drawable-to-bitmap
A library that can be used to convert your drawables into bitmap.

# How To use Library

1. Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
     
2.  Add the dependency

	dependencies {
	        implementation 'com.github.prashant2917:drawable-to-bitmap:Tag'
	}
     
3. Initialize the library using below code.<br>
     val drawableToBitmap = DrawableToBitmap.createInstance()
     
 4. Call the below function to convert Drawable to Bitmap.<br>
       val bitmap =  drawableToBitmap.convertDrawableToBitmap("Your Drawable resource")
       
  5. Use the bitmap as per your convenient after converting it.<br>
  
  
  Thanks !!
