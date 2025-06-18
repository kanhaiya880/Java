-----------------------------------------------------------------------------------------------	
						Differnce Between Shallow Copy And Deep Copy
-----------------------------------------------------------------------------------------------
Definition: In Programming ,A copy refers to creating dublicate of an object or 
			data structure

--------------------------------------------
# Need of shallow copy and deep copy
--------------------------------------------
lst1=[10,20,30,40]
lst2=[]
lst2=lst1
lst1------>[10, 20, 30, 40]
lst2------>[10, 20, 30, 40]
lst1.append(100)
lst1------>[10, 20, 30, 40, 100]
lst2------>[10, 20, 30, 40, 100]
id(lst1)------>1332442210560
id(lst2)------>1332442210560
id(lst1)==id(lst2)------>True

--------------------------------------------
1.Shallow copy
--------------------------------------------
- Definition:		A shallow copy creates a new object,

- How to perform shallow copy:

  i]  using copy function of list class ( exp: lst2=lst1.copy())
  ii] using type Casting function of list (exp: lst2=list(lst1))
  iii]using list comprehension technique ( exp:lst2=[i for i in lst1 ])
  iv]using copy module:
  
			import copy
			lst1=[10,20,30,40]
			lst2=[]
			lst2=copy.copy(lst1)


