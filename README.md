# TestOne
Test 1:
1.	What set of commands are executed to push a repo on Github?

git add “ProjectName”
git commit  -a –m “Message”
git push

2.	Where the strings.xml in the project structure?

In the values 

3.	What is the difference between SP and DP?

DP is a virtual unit that is based on the density of the screen. 
SP is similar to DP but it can scale according to the font size preference of the user

4.	How can you support multiple languages in your app? Explain step by step process.

To add support for more locales we new to create additional directories inside res and then local files.

5.	What is the difference between match_parent and wrap_content?

Match_paren means that the view wants to be as big as its parent (minus padding) 
Wrap_content which means that the view wants to be just big enough to enclose its content (plus padding) 


6.	How can you setup a method for a button click without binding the view?


7.	How can you define a button click method with binding the button view?



8.	How can you change the color of the TextView?

Android:textcolor=”color_purple”>


9.	Where are all the colors in the android architecture saved?

In the libraries?  Or in the application framework?




10.	How would you add a different layout for a landscape and a language? Name the 

qualifiers.

Create a layout-land directory and put the landscape version layout XML file in that directory

11.	How would you make the keyboard hide for EditText when the activity is created?

android:configChanges="keyboardHidden|orientation">

12.	WHAT ARE VIEWGROUPS AND VIEWS?

Viewgroup is a special view that can contain other views (children)

View is the base class for widgets they are used to create interactive UI components such as buttons, text fields.

13.	What attribute is necessary in a linear layout if there are more than one child views?
You would need the orientation of each child since they are laying on top of each other.

14.	In which case you would use a Linear layout and a Relative layout?

I would use linear layout for 

I would use relative layout for

15.	How would you load an image in an ImageView from xml and programmatically?


16.	List all the states in an activity lifecycle.
On create, on start, on resume, on pause, on stop and on destroy.

17.	What is the lifecycle of activity one and activity two when we go to activity one from two?
Activity one will be on stop and active two will be on resume.

18.	How to restrict an activity from changing the orientation?

     android:screenOrientation="portrait"
     

19.	Which method is called to persist the data before the activity is destroyed?

saveData 


20.	What is the argument of that method?

(View view)


21.	How do we save the data in the method?
 We use sharedPreferences to save the data 


22.	How to get that data back? What is the name of the method?

We aslo use sharedPreferences to get data back and the method is getData


23.	What is a bundle? What can a bundle contain?

A mapping from String values to various Parcelable types. 
We use it for passing data between various activities


24.	What is the difference between onPause and onStop?

On Pause is when the app is waiting for a user to finish interacting with a pop up or a new window while using the app. On stop is when the user has left the app and gone to a different app or has pressed the home button. 

25.	How to start an activity for getting a result back?

We need an intent to use the startActivityForResult() method. 

26.	Which callback is used get the result back in the above case?

Result_oK if it was successful or result_canceled oif it wasn’t 


27.	What are difference types of Intent? What are the difference between them? When do we use each of them?

Explicit intents specify the component to start by name 
Implicit intents don’t name a specific component instead they declare a general action to perform. This allows a component from another app to handle it.




28.	How to communicate data between activities?

We can use a bundle and create a new intent 

29.	How to add data to an intent?
First we have to attach the data to the intent object using a Bundle class. Then call the activity using startActivity() or startActivityForResult() methods.

30.	What kind of data can be added to an intent?



31.	How to get the data sent from activity one in activity two?



32.	What is context?


33.	Name different kinds of layouts in Android?
Linear, relative,

34.	How to send an object through an Intent?

We have to implement whatever class we have to serializable then we create a new intent.
Then we can use intent.putExtra("sport", object) and finaly just use startActivity(intent);


35.	What is Serializable? 

Serialization is when we convert an object into a stream of bytes in order to store the object or transmit it to memory a database or a file. The main purpose is to save the state of an object in order to be able to recreate it when need it.



36.	What is Parcelable?

interface where you implement the serialization yourself. It was created to be far more efficient that Serializable

37.	Which is better and why?

Parcelable is better because it can get around some problems with the default java

38.	How can an object class be Serializable or Parcelable? Explain in detail the methods to implement if any?





39.	Can we avoid implementing methods using Parcelable?


40.	What are launch modes? Explain each one of them in detail.

The standard, single, single stack

41.	What is back stack?

A task is a collection of activities that the users interact while performing a certain job. The activities are arranged in a stack which is the “back stack


42.	How to we create a .apk file?


43.	How to create and signed .apk file
