###pseudo code for library membership
start
   class member 
   attribute name
   attribute ID
   attribute membership date 
   
  define constructor(name,Id, membership date )
   set name
   set id
   set  membership date 
   
  define method checkValidity()
   if  membership date < validity_end_date
   print member is valid 
   else 
   print member is not valid.

define 
class main
object member1 = new member("dev",007,10-08-2025)
member1.checkValidity()