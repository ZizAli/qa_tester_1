package evvelkidersler;

public class metodlar {
    public static void main(String[] args) {
    }
}

/* String Method	Description	Return Type
charAt()	Returns the character at the specified index (position)	char
codePointAt()	Returns the Unicode of the character at the specified index	int
codePointBefore()	Returns the Unicode of the character before the specified index	int
codePointCount()	Returns the number of Unicode values found in a string.	int
compareTo()	Compares two strings lexicographically	int
compareToIgnoreCase()	Compares two strings lexicographically, ignoring case differences	int
concat()	Appends a string to the end of another string	String
contains()	Checks whether a string contains a sequence of characters	boolean
contentEquals()	Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer	boolean
copyValueOf()	Returns a String that represents the characters of the character array	String
endsWith()	Checks whether a string ends with the specified character(s)	boolean
equals()	Compares two strings. Returns true if the strings are equal, and false if not	boolean
equalsIgnoreCase()	Compares two strings, ignoring case considerations	boolean
format()	Returns a formatted string using the specified locale, format string, and arguments	String
getBytes()	Converts a string into an array of bytes	byte[]
getChars()	Copies characters from a string to an array of chars	void
hashCode()	Returns the hash code of a string	int
indexOf()	Returns the position of the first found occurrence of specified characters in a string	int
intern()	Returns the canonical representation for the string object	String
isEmpty()	Checks whether a string is empty or not	boolean
join()	Joins one or more strings with a specified separator	String
lastIndexOf()	Returns the position of the last found occurrence of specified characters in a string	int
length()	Returns the length of a specified string	int
matches()	Searches a string for a match against a regular expression, and returns the matches	boolean
offsetByCodePoints()	Returns the index within this String that is offset from the given index by codePointOffset code points	int
regionMatches()	Tests if two string regions are equal	boolean
replace()	Searches a string for a specified value, and returns a new string where the specified values are replaced	String
replaceAll()	Replaces each substring of this string that matches the given regular expression with the given replacement	String
replaceFirst()	Replaces the first occurrence of a substring that matches the given regular expression with the given replacement	String
split()	Splits a string into an array of substrings	String[]
startsWith()	Checks whether a string starts with specified characters	boolean
subSequence()	Returns a new character sequence that is a subsequence of this sequence	CharSequence
substring()	Returns a new string which is the substring of a specified string	String
toCharArray()	Converts this string to a new character array	char[]
toLowerCase()	Converts a string to lower case letters	String
toString()	Returns the value of a String object	String
toUpperCase()	Converts a string to upper case letters	String
trim()	Removes whitespace from both ends of a string	String
valueOf()	Returns the string representation of the specified value	String

 */

/*

Math Method	Description	Return Type
abs(x)	Returns the absolute value of x	double|float|int|long
acos(x)	Returns the arccosine of x, in radians	double
addExact(x, y)	Returns the sum of x and y	int|long
asin(x)	Returns the arcsine of x, in radians	double
atan(x)	Returns the arctangent of x as a numeric value between -PI/2 and PI/2 radians	double
atan2(y,x)	Returns the angle theta from the conversion of rectangular coordinates (x, y) to polar coordinates (r, theta).	double
cbrt(x)	Returns the cube root of x	double
ceil(x)	Returns the value of x rounded up to its nearest integer	double
copySign(x, y)	Returns the first floating point x with the sign of the second floating point y	double|float
cos(x)	Returns the cosine of x (x is in radians)	double
cosh(x)	Returns the hyperbolic cosine of a double value	double
decrementExact(x)	Returns x-1	int|long
exp(x)	Returns the value of Ex	double
expm1(x)	Returns ex -1	double
floor(x)	Returns the value of x rounded down to its nearest integer	double
floorDiv(x, y)	Returns the division between x and y rounded down	int|long
floorMod(x, y)	Returns the remainder of a division between x and y where the result of the division was rounded down	int|long
getExponent(x)	Returns the unbiased exponent used in x	int
hypot(x, y)	Returns sqrt(x2 +y2) without intermediate overflow or underflow	double
IEEEremainder(x, y)	Computes the remainder operation on x and y as prescribed by the IEEE 754 standard	double
incrementExact(x)	Returns x+1	int|double
log(x)	Returns the natural logarithm (base E) of x	double
log10(x)	Returns the base 10 logarithm of x	double
log1p(x)	Returns the natural logarithm (base E) of the sum of x and 1	double
max(x, y)	Returns the number with the highest value	double|float|int|long
min(x, y)	Returns the number with the lowest value	double|float|int|long
multiplyExact(x, y)	Returns the result of x multiplied with y	int|long
negateExact(x)	Returns the negation of x	int|long
nextAfter(x, y)	Returns the floating point number adjacent to x in the direction of y	double|float
nextDown(x)	Returns the floating point value adjacent to x in the negative direction	double|float
nextUp(x)	Returns the floating point value adjacent to x in the direction of positive infinity	double|float
pow(x, y)	Returns the value of x to the power of y	double
random()	Returns a random number between 0 and 1	double
rint(x)	Returns the double value that is closest to x and equal to a mathematical integer	double
round(x)	Returns the value of x rounded to its nearest integer	long|int
scalb(x, y)	Returns x multiplied by 2 to the power of y	double|float
signum(x)	Returns the sign of x	double|float
sin(x)	Returns the sine of x (x is in radians)	double
sinh(x)	Returns the hyperbolic sine of a double value	double
sqrt(x)	Returns the square root of x	double
subtractExact(x, y)	Returns the result of x minus y	int|long
tan(x)	Returns the tangent of an angle	double
tanh(x)	Returns the hyperbolic tangent of a double value	double
toDegrees(x)	Converts an angle measured in radians to an approx. equivalent angle measured in degrees	double
toIntExact(x)	Converts a long value to an int	int
toRadians(x)	Converts an angle measured in degrees to an approx. angle measured in radians	double
ulp(x)	Returns the size of the unit of least precision (ulp) of x	double|float
 */

/*
Array Method	Description
compare()	Compares two arrays
copyOf()	Creates a copy of an array with a new length
deepEquals()	Compares two multidimensional arrays to check whether they are deeply equal to each other
equals()	Checks if two arays are equal
fill()	Fills an array with a specified value
mismatch()	Returns the index position of the first mismatch/conflict between two arrays
sort()	Sorts an array in ascending order
 */

/*
ArrayList Method	Description	Return Type
add()	Add an item to the list	boolean|void
addAll()	Add a collection of items to the list	boolean
clear()	Remove all items from the list	void
clone()	Create a copy of the ArrayList	Object
contains()	Checks whether an item exist in the list	boolean
ensureCapacity()	Increase the capacity of the list to be able to fit a specified number of items	void
forEach()	Perform an action on every item in the list	void
get()	Return the item at a specific position in the list	T
indexOf()	Return the position of the first occurrence of an item in the list	int
isEmpty()	Checks whether the list is empty	boolean
iterator()	Return an Iterator object for the ArrayList	Iterator
lastIndexOf()	Return the position of the last occurrence of an item in the list	int
listIterator()	Return a ListIterator object for the ArrayList	ListIterator
remove()	Remove an item from the list	boolean|T
removeAll()	Remove a collection of items from the list	boolean
removeIf()	Remove all items from the list which meet a specified condition	boolean
replaceAll()	Replace each item in the list with the result of an operation on that item	void
retainAll()	Remove all elements from the list which do not belong to a specified collection	boolean
set()	Replace an item at a specified position in the list	T
size()	Return the number of items in the list	int
sort()	Sort the list	void
spliterator()	Return a Spliterator object for the ArrayList	Spliterator
subList()	Return a sublist which provides access to a range of this list's items	List
toArray()	Return an array containing the list's items	Object[]
trimToSize()	Reduce the capacity of the list to match the number of items if necessary	Object[]

 */

/*
Scanner Method	Description	Return Type
close()	Close the scanner object	void
delimiter()	Return the delimiter used to separate tokens	Pattern
findInLine()	Return a string which matches a regular expression in the current line	String
findWithinHorizon()	Return a string which matches a regular expression within a specified number of characters	String
hasNext()	Return true if another token can be found	boolean
hasNextBoolean()	Return true if the next token represents a boolean value	boolean
hasNextByte()	Return true if the next token represents a byte value	boolean
hasNextDouble()	Return true if the next token represents a number	boolean
hasNextFloat()	Return true if the next token represents a number	boolean
hasNextInt()	Return true if the next token represents an int value	boolean
hasNextLine()	Return true if another line of text is available in the scanner	boolean
hasNextLong()	Return true if the next token represents a long value	boolean
hasNextShort()	Return true if the next token represents a short value	boolean
locale()	Return the scanner's locale	Locale
next()	Return the next token in the scanner	String
nextBoolean()	Return the boolean value of the next token in the scanner	boolean
nextByte()	Return the byte value of the next token in the scanner	byte
nextDouble()	Return the double value of the next token in the scanner	double
nextFloat()	Return the float value of the next token in the scanner	float
nextInt()	Return the int value of the next token in the scanner	int
nextLine()	Return the next line of text in the scanner	String
nextLong()	Return the long value of the next token in the scanner	long
nextShort()	Return the short value of the next token in the scanner	long
radix()	Return the scanner's radix	int
reset()	Reset the scanner's configuration	int
useDelimiter()	Set the delimiter used by the scanner to separate tokens	Scanner
useLocale()	Set the locale used by the scanner	Scanner
useRadix()	Set the radix used by the scanner	Scanner
 */