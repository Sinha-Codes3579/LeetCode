WORKING OF CODE:

-> Create a list of integer array to add the robot's initial positions, healths and directions
-> 'Collections.sort' :
    1. Collections is a utility class in the Java Collections Framework.
    2. sort is a static method of this class that sorts the specified list according to the order induced by the
     specified comparator.
-> The second argument to Collections.sort is a comparator, which is used to determine the order of the elements.
-> Lambda Expression (a, b) -> Integer.compare(a[0], b[0]):
    1. (a, b): These are the parameters of the lambda expression, representing two elements from the list.
    2. Integer.compare(a[0], b[0]): This is the body of the lambda expression. It uses 'Integer.compare' to compare the
    first elements (a[0] and b[0]) of the two arrays a and b.