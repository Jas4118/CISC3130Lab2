# CISC3130Lab2
This is my second lab for CISC 3130 section TY9 for Katherine Chuang by Jason Li. I had several issues like scanner but ended up finding different solution.
I had certain issues where my scanner would stop after the 70th array and keep returning null so I had to start looking for stuff like buffered reader and hashsets. Hashsets made it easier since I didn't have to order the artist names. I read through the file regional-global-daily-latest and split the list by comma and take the third part of the string split by the commas. I then set that as an object of artistName and add temp the nameSet HashSet and adds to frequency in artistName if it appears. The program then prints to the file outputF.txt and ends there.
