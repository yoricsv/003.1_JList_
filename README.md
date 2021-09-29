# 003.1_JList_

### Thead Sinchronized collections:
(slower)
- Stack
- Vector

### Treadsafe collections:<br/>
(more faster than Sunchronized,
can create synchronized by the metod **Collections.synchronizedList()**)
- ArrayList
- LinkedList
  
  ### Comparison
  ArrayList | LinkedList
  --- | ---
  Based on an Array | Based on multi-directional List
  Get element by Index | Get elements via Iterator
  Ordered | Ordered
  Begin form Zero | Used for creation of Queue and Stack
  Fast read/write values | Fast add/delete Elements

  FIFO (**F**irst **I**n **F**irst **O**ut) - *Stack*<br/>
  LIFO (**L**ast **I**n **F**irst **O**ut)  - *Queue*