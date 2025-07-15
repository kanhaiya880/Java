
						Differnce Between Deep Copy and Shallow Copy
--------------------------------------------------------------------------------------------------
Definition: In Programming ,A copy refers to creating dublicate of an object or data structure

1.Shallow Copy

	- Shallow copy creates new object,but does not create copies of object contained within original,it only copies
	  references to the object inside the container

#Need of shallow copy
lst1=[10,20,30,40]
lst2=lst1
lst1 ---->[10, 20, 30, 40]
lst2 ---->[10, 20, 30, 40]
id(lst1) ----->2005815816256
id(lst2)------>2005815816256
id(lst1)==id(lst2) ----->True
lst1.append(100)
lst1 ------>[10, 20, 30, 40, 100]
lst2 ------>[10, 20, 30, 40, 100]
lst2.append("hellow")
lst2------>[10, 20, 30, 40, 100, 'hellow']
lst1------->[10, 20, 30, 40, 100, 'hellow']
-----------------------------------------------------------------------------------
lst1=[10,20,30,40]
lst2=lst1.copy() #we can achive shallow copy using copy()
lst1------>[10, 20, 30, 40]
lst2------>[10, 20, 30, 40]
id(lst1)------>2804050795904
id(lst2)------>2804050940160
id(lst1)==id(lst2)------>False
-------------------------------------------
#nested list
lst1=[[5,2],"Rossum","Travis"]
lst2=lst1.copy()
lst1----->[[5, 2], 'Rossum', 'Travis']
lst2 ----->[[5, 2], 'Rossum', 'Travis']
lst1[0][0]=100
lst1----->[[100, 2], 'Rossum', 'Travis']
lst2----->[[100, 2], 'Rossum', 'Travis']
lst2[1]=100
lst2----->[[100, 2], 100, 'Travis']
lst1----->[[100, 2], 'Rossum', 'Travis']

---------------------------------------------------
Way's for shallow copy

- lst2=lst1.copy()
- lst3=list(lst1)
- lst4=[ i for i in lst3]
- lst5=lst4[:]

- using copy module
import copy
lst1=[[5,2],10,20,30,40]
lst2=copy.copy(lst1)
lst1
[[5, 2], 10, 20, 30, 40]
lst2
[[5, 2], 10, 20, 30, 40]

lst1[0][0]=100
lst1----->[100, 2], 10, 20, 30, 40]
lst2--->[[100, 2], 10, 20, 30, 40]
lst2[1]="hellow"
lst1----->[[100, 2], 10, 20, 30, 40]
lst2----->[[100, 2], 'hellow', 20, 30, 40]

