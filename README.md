# JAVA-PRACTICE
@String and StringBuffer and StringBuilder

String object are immutable and StringBuffer are mutable. ( == and equals ) == is used for referene comparision only and equals is used for content comparision. but when it comes to the stringbuffer both methods act as reference comparison.
JAVA people peovide special memory management called SCP for string because they are oftenly used. furthermore, all the wrapper class objects are immutable like int, float and etc...

@String object creation and String constant pool(SCP)

String s = new String("madusanka")=> create 2 objects (Heap area and SCP) but String s = "madusanka"=> create only one in SCP
when we use new keyword external object is created in SCP for future needs.

@Importance of SCP

reusability (memory utilization)
immutability consept (because of SCP String are cannot be mutable)

@Constructor and String class

empty constructor, only one String paraeter as an argument in constructor, only one StringBuffer paraeter as an argument in constructor, only one StringBuilder paraeter as an argument in constructor
String s = new String(String/StringBuffer/StringBuildr/char[]/byte[] parameter);

@isEmpty(),length(),replace(),substring() of String class

String s = "Madusanka";
s.isEmpty() => return boolean | s.length() => return integer [length method is applicable for string and length variable is applicable for arrays]
s.replace(char old, char new) => s.replace(a,b) [every a letter will be replaced with b]
s.substring(int beginIndex) [from begin index to end of the string] | s.substring(int firstIndex, int lastIndex) [from firstIndex to lastIndex-1]

@indexOf(),lastIndexOf() of String

@final vs imuutability

final keywords is not referring the immutability consept. it avoids new object is creation with same variable
final variable is there
immutable object is there

@stringBuffer

where string value is recently modified you should not used String class. for that you can use StringBuilder. because StringBuilder has only one object even changes are happening on the object.

@StringBuffer constructors and [length() and capacity()]

length() => currently how many characters are there
capacity() => maximum number of characters can be stored there
StringBuffer = new StringBuffer(); -> 16 is default capacity
StringBuffer = new StringBuffer(1000); -> 1000 is default capacity
next string_buffer capacity = (cc + 1)*2 

@charAt(),setCharAt() and append()

charAt(int index)
setCharAt(int index, char character)
sb.append(String s)

@insert()| delete()| deleteCharAt()| delete()| reverse()

sb.insert(int index, String s| Double d| Char c)
sb.delete(int brgin, int end) [from begin index to end -1 index]
sb.deleteCharAt(int index)

@setLength(), ensureCapacity() and trimToSize()

sb.setLength(int length)
sb.ensureCapacity(int capacity)
sb.trimToSize()

@StringBuilder and StringBuffer

why -> every method inside StringBuffer is synchronized.
It is also same as the StringBuffer only differnce is it is non-synchronized
StringBuffer is thread safe

@String , @StringBuffer and @StringBuilder

String -> if content is not change or fixed, it is better to use String
StringBuffer -> if content is recently changed and thread safe, it is better to use StringBuffer
StringBuilder -> asynchronus behaviours can be handle by using this

@method chaning

StringBuffer nsb = sb.m1().m2().m3()  



...........................COLLECTION API | COLLECTION FRAMEWORK............................

@collection
It is a group of object as a single entity
