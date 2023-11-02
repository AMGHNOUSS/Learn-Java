

## Methods String

In Java, the String class is a built-in class that represents a sequence of characters. It is widely used for text manipulation and processing. Here are some of the commonly used methods and operations available for working with String objects:

Creating Strings:
```
String str = "Hello, World!"; - Create a string literal.
String str = new String("Hello, World!"); - Create a string object.
```

String Length:
```
int length = str.length(); - Get the length of the string.
```

Accessing Characters:
```
char charAtIndex = str.charAt(index); - Get the character at a specific index.
```

Concatenation:
```
String concatenated = str1 + str2; - Concatenate two strings.
String concat = str.concat(str2); - Concatenate using the concat method.
```

Substring:
```
String substring = str.substring(startIndex); - Get a substring from the starting index to the end.
String substring = str.substring(startIndex, endIndex); - Get a substring with a specified range.
```

Comparison:
```
boolean isEqual = str1.equals(str2); - Compare two strings for equality.
boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2); - Compare two strings for equality ignoring case.
int compareToResult = str1.compareTo(str2); - Compare two strings lexicographically.
```

Searching:
```
int indexOf = str.indexOf(substring); - Find the index of the first occurrence of a substring.
int lastIndexOf = str.lastIndexOf(substring); - Find the index of the last occurrence of a substring.
```

Replacement:
```
String replaced = str.replace(oldChar, newChar); - Replace all occurrences of a character.
String replaced = str.replaceAll(regex, replacement); - Replace using regular expressions.
```

Trimming:
```
String trimmed = str.trim(); - Remove leading and trailing whitespace.
```

Case Conversion:
```
String upper = str.toUpperCase(); - Convert to uppercase.
String lower = str.toLowerCase(); - Convert to lowercase.
```

Checking for Substring:
```
boolean contains = str.contains(substring); - Check if the string contains a specific substring.
```

Splitting:
```
String[] parts = str.split(delimiter); - Split the string into an array of substrings.
```

Empty or Null Checks:
```
boolean isEmpty = str.isEmpty(); - Check if the string is empty.
boolean isNull = (str == null); - Check if the string is null.
```

Converting to/from Other Types:
```
int intValue = Integer.parseInt(str); - Convert to an integer.
String fromInt = String.valueOf(intValue); - Convert from an integer to a string.
```

String Builder/Buffer:
```
StringBuilder and StringBuffer are mutable alternatives for string manipulation that provide better performance in some cases.
```

These are some of the fundamental methods for working with String in Java. There are more advanced methods and capabilities available for handling strings, but these should cover most common use cases.