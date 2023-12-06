When We do which kind of rotation :- 

*** When we perform LEFT LEFT Rotation (LL) :- ***

In simple terms if right side is unbalance then do left left rotation.
When a node is added into the right subtree of the right subtree.

	A
	 \
	  B
	   \
	    C

If this is the condition then we perform LL rotation.

So, for this we are going to write the condition of 
assume k is the balance factor 
as we know k = height(left(node) - height(right))

see node.right.data means B which must be smaller than the C then only C will 
be inserted into the right of B 

```
if (k<-1 && node.right.data<data) {
// then perform the Left Left rotation
}
```


*** When we perform RIGHT RIGHT Rotation (RR) :- ***

In simple terms if the tree is left side unbalance then perform the
right right rotation.

When a node is added into the left subtree of left subtree then,
it makes the left side unbalance so we need to do the RIGHT RIGHT rotation.
	  C
	 /
	B
       /
      A

If this is the condition then we need to do right right (RR) rotation

So, for this we are going to write the condition of 
assume k is the balance factor 
as we know k = height(left(node) - height(right))

see node.right.data means B which must be large than the A then only A will 
be inserted into the left of B 

```
if (k>1 && node.right.data>data) {
// then perform the left left rotation.
}
```


*** When we perform RIGHT LEFT Rotation (RL) :- ***

When a node is inserted into the left side of right subtree then we need to do
RL rotation.

```

          A
	   \
	    C
	   /
	  B
```

so for this :-

```
if (k<-1 && data<node.right.data) {
// then we need to perform RL rotation
}

```


*** When we perform LEFT RIGHT Rotation (LR) :- ***

When a new node is inserted into the Right subtree of the left subtree then
we need to perform this rotation.

```
	   C
	  /
	 A
	  \
	   B
```


condition for this one :- 

```
if (key>1 && node.left<data) {
// then perform the LR rotation
}
```
