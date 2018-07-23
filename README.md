Necesito Bartering App
===================================

About
---------------

"Necesito" is spanish for "I Need" and is a Bartering app made for the people of Venezuela. Created during the Hack For Venezuela Hackathon of July, our team decided to create this app to give peope a chance to recieve the goods and services they need in a country where their currency is super inflated and unable to buy much of anything. Bartering is the answer as it does not rely on any form of government regulated currency.


Checklist
---------------

1. Creation and connection to a backend, either with firebase or other. In doing so, remove the dummy data in place currently.

2. Set up AndroidManifest.xml and other related files so there is a seamless and logical progression from activity to activity. An example being the flow from Login to the User Info page to the Main Activity page, thinking about cases when
a user has already signed in so upon re-rentry to the app they do not have to login again.

3. Create an activity for viewing the posts and having an option to send the original poster a message or notification of interest, rating the post's user, and a button to report a poster.

4. Logic to handle low rated users and users to have been reported. Set up a system where after 2 or 3 reportd incidents and or consistently low reviews, a user is kicked out of the app. Also, handle users who troll and maliciously report or give other users low scores.

5. Connect to some sort of API that pinpoints where a user is and where a post's original user is located. Then returns the distance these two users are from each other in kilometers.

6. Upon trading whatsapp numbers, Toast a message giving safety tips for bartering with strangers.

7. Create a values/string.xml file and folder for other langauges, specifically spanish and venezuelean spanish. After wards, remove all the hard coded text and replace with references to these files.

8. Add more goods and services.

9. Have a search button within the post_list.xml file to sort posts by closeness and other relevant identifiers.

10. Ask for users to take a picture of the items they have with only photots they have just taken a picture of and use Machine Learning classifiers to determine if the pictures are the items they are advertising.

11. Add an option for how urgent these items are needed in a post.


Getting Started
---------------

This sample uses the Gradle build system. To build this project, use the
"gradlew build" command or use "Import Project" in Android Studio.


App Demonstration
---------------


1. LoginActivity.java/ login_activity.xml: Login Screen, when you first open the app

![Login Screenshot](img/Login_Activity.png)



2. UserInfo.java/ profile_setup.xml: After signing in, submitting details to put into your

own profile and possibly into a post

![User Info Screenshot](img/User_Info_Activity.png)



3. MainActivity.java/ main_activity.xml: A clickable list of all the selectable goods and services that could be bartered

![Main List Screenshot](img/Main_List_Activity.png)



4. post_item.xml/ post_item_list.xml: The list of all the posts for the items of a particular good and service. Includes data

on what the original poster wants, approximate distance away from the user looking at the post,

and their user score

![Sub List Screenshot](img/Sub_List_Activity.png)


Contributers
---------------
Edgar Jr San Martin - Developer
