# ProjectDS1
 

Department of Computer Science
COMP242
Second 2021/2022
Project #1
Due Date: Tuesday, Thursday (26,27,28 April 2022)

Write an airline GUI ticket reservation system using Java FX. The program should display a menu with the following options: 
1.	Read data
a.	Read the flights information from a file named flights.txt 
b.	Read the passengers' information (reservations) from a file named passengers.txt 
	يتم قراءة الملفات من الجهاز حيث يجب على الطالب ان يستعرض الملفات والمجلدات لكي يختار الملف المطلوب، حيث ليس شرطا ان يكون مخزن بنفس مجلد المشروع
2.	Display flight’s information.
	يتم استعراض جميع الرحلات وتفاصيلها كل رحله على سطر
3.	Display Passengers information for a specific flight.
	يتم ادخال رقم الرحلة ومن ثم يتم طباعة معلومات جميع المسافرين على هذه الرحلة
4.	Add/Edit flight
	يتم ادخال رقم الرحلة واذا كانت موجودة يتم عرض بياناتها للتعديل عليها وان لم تكن موجودة يقوم النظام بإستقبال كافة البيانات الخاصة بها واضافتها على الرحلات


5.	Reserve a ticket for a specific flight
	يتم من خلاله حجز تذكرة لرحلة معينة حيث يجب ان يتم ادخال جميع البيانات الخاصة بالمسافر وايضا يكون رقم التذكرة هو عبارة عن اعلى رقم تذكره بالرحلة مضاف اليها واحد
6.	Cancel a reservation 
	يتم ادخال رقم الرحلة واسم المسافر حيث اذا كان موجودا يتم الغاء نذكرته وان لم يكن موجودا يتم اعلام المستخدم بذلك
7.	Check whether a ticket is reserved for a particular person
	يتم فحص الحجز بناء على اسم المسافر ورقم الرحلة بحيث يكون الجواب ان هنالك حجز ام لا
8.	Search for a specific passenger and print all his information (Flight number, Ticket number, Full name, Passport number, Nationality, and Birthdate).
	يتم فحص جميع الرحلات اذا كان هنالك حجز لمسافر معين بناء على اسم المسافر وعرض بيانات بيانات المسافر على كل رحلة
9.	Exit
The information is maintained on an alphabetized linked list of names (passengers linked list). Assume that tickets are reserved for only one flight. Create a linked list of flights (sorted by flight number in ascending order) with each node, including a reference to a linked list of passengers.
You must read the flights information from a file named flights.txt (flight number (int), airline name (String), source (String), and destination (String), Capacity (int)). And also, read the passengers' information from a file named passengers.txt (Flight number (int), Ticket number (int), Full name (String), Passport number (String), Nationality (String), and Birthdate (Date)). 











All the best!
