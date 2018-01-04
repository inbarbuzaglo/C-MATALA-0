# C-MATALA-0

code description:
The program consists of 9 classes:
First, we built the following objects:

Position - accepts three parameters of the csv table: lat, lon, alt and builds the coordinates.

WifiData - receives 4 parameters of the csv: Mac, SSID, Freaquncy, RSSI, so that it represents a wifi point. These parameters will repeat themselves up to 10 times, since at each step we will search for the 10 most powerful Wifi points.

StartLine - accepts 3 parameters of the csv: Time, ID, and # WifiNetWork #, which are the three parameters from which the fixed headers are built in the first row.

Line-accepts the three objects above and builds the row object - each line in the csv file.

Main:In this class we open the folder where the Wigle application files are located

ListFromCSV:In this class we read each file, and build an ArrayList that unites all the files from the folder. During the consolidation, also merging lines with the same file (also different files from the same folder). Only the best 10 WIFI signals  from any location entering ARRAYLIST.

CSV:In this class we build the csv file according to the requested format:
46 columns in the table: 6 first columns, plus 4 columns for each Wifi point, the first row contains headlines
And below the information itself.

ToKML:This class takes the csv table and creates a KML file using the jak package.

Filter:This class filters by location or date (at user request) and sends the KML to the filter.
The Date filter is not always working, we didn't succeed to fix the bug yet.

line_OUTPUT_FORMAT-int the class, we define external line object that incluod up to 10 wifi network and represent scanning as an object.(according the format of requested csv table) 

Algo- In this class,we will revalue the location of the MAC using the information in the csv file,
 We will look for the most powerful MAC samples in the file and calculate a weighted average.

Algo2- In this class, we will get a number of Wifi samples, which will help us revalue the user's position by a weighted center of gravity algorithm.

WeightedMean-we inserted to this class the calculation of the whightedMean as an Object.

GUI-that's out user interface ,  through this window we can perform the functions we have built throughout the whole program
Wrapper-This is the mediator between our code and the GUI, it includes all our functions that getting meaning in a press of button 
in the window that is shown to the user
