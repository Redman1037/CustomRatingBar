# CustomRatingBar
Custom rating bar for android using recyclerview

Project is in Progress


# Usage 

Project level `build.gradle`

```
 maven {
            url 'https://jitpack.io'
        }
 ```
       
add dependency

    implementation 'com.github.Redman1037:CustomRatingBar:1.0.0'

XML

```
    <com.github.redman1037.custom_rating_bar.CustomRatingBar
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:selected_star_color="#ffffff"
        app:un_selected_star_color="@color/colorPrimaryDark"
        app:no_of_stars="5"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"
        android:id="@+id/customRatingBar"
        app:selected_star="@drawable/star_filled"
        app:un_selected_star="@drawable/star_unfilled"
        />
   ```
        
Listener
        
        ratingBar.onCustomRatingBarChangeListener =
            object : CustomRatingBar.OnCustomRatingBarChangeListener {
                override fun onRatingChange(customRatingBar: View, rating: Float) {
                //do stuff
                }

            }
        


# Credits

Icons:-

<img src="https://raw.githubusercontent.com/Redman1037/CustomRatingBar/master/custom_rating_bar/src/main/res/drawable/custom_rating_bar_star.png" width="24" height="24"> :- Icon made by [Revicon](https://www.flaticon.com/authors/revicon) from www.flaticon.com

<img src="https://raw.githubusercontent.com/Redman1037/CustomRatingBar/master/custom_rating_bar/src/main/res/drawable/custom_rating_bar_star_rounded.png" width="24" height="24">  :- Icon made by [Smashicons](https://www.flaticon.com/authors/smashicons) from www.flaticon.com


# License 

```
MIT License

Copyright (c) 2019 Redman1037

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
