-> Use stack when questions says to process string that contain brackets
-> We have multiple elements and we want to count them and multiply counter them if we found multiplier counter 
   after brackets. Store every pair of bracket in stack hashmap where key is its element name and value is its 
   counter for current bracket.
-> PROCESS CHARACTERS IN FORMULA:
   -> Don't consider '(' and ')', so we have only letters and numbers.We are currently not in brackets, so add 
      the counter

CODING: 
1. Initialize result_counter to store the count of each element as an empty dictionary.
2. Initialize parenthesis_stack as an empty list to store dictionaries for count of elements inside parenthesis.
3. Initialize cur_ind to 0 that shows cur_ind.
4. Start a while loop that runs until cur_ind is less than n and store the value element at cur_ind in cur_char(char type)
5. if we found cur_char is equal to '(' then:
   Increment cur_ind by 1 and append empty dictionary to parenthesis_stack.
6. if we found cur_char is equal to ')' then:
   -> Initialize mult as an empty string to store the multiplier
   -> Increment cur_ind by 1.
   -> while cur_char is digit then append it to mult and increment cur_ind.
   -> Pop the last dictionary from parenthesis_stack into last_counter.
   -> Set the target in last dictionary of parenthesis_stack if exists otherwise set it to result_counter.
   -> For each element and count in last_counter, add the count multiplied by mult to the corresponding count in target.
7. If cur_char have not any brackets then :
   -> Initialize cur_elem as an empty string to store current element.
   -> Initialize cur_counter as an empty string to store current element's count.
   -> Set the target in last dictionary of parenthesis_stack if exists otherwise set it to result_counter.
   -> While cur_char have not any parenthesis and cur_ind is less than n then:
      if cur_elem is an alphabet:
         if character is alphabet and cur_elem is not empty, add cur_elem to target with its count
           reset cur_counter and cur_elem.
           Append the character to cur_elem.
      Otherwise, append the character to cur_elem.
      Increment the cur_ind by 1 and update cur_char.
      Add the last element and its count to target.
8. Construct the output by joining the element's names and counts(if greater than 1) sorted by element names.
9. Return the resultant string.