The BoardBox constructor:

- accepts: String sym, String color. That is, the ID(initially) for each box is String.
- this is check if there are any valid "xox" matchets that are already considered.
- and for this i'm making a index string while checking for "xox", and adding this string to alreadyMatched.
- this way we don't accidentally make any errors.

current StartGameLoop - control flow:

1. read a valid symbol
2. if sym is exit -> game over
3. read a valid box id
4. get box, box is empty -> goto 9
5. update the box(sym, color)
6. calculate and update the player score accordingly (if got any)
7. update the curr player
8. display player score (if got any)
9. if game over(ttl filled boxes) -> exit(game over), else -> goto 1
