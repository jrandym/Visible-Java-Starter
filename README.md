# **Pumpkin Stamp: Build a Fall Scene**

`drawPumpkin` is a method with arguments. You call it, and it stamps a pumpkin wherever you tell it to.

## Run it

1. Run the sketch.
2. Move the mouse and press `p` to stamp a pumpkin.
3. Press `r` to clear the sky and start over.

## Mission 1: Change an argument

The call is `drawPumpkin(mouseX, mouseY, 0.4);`
Predict first: what changes if you pass `0.2` instead of` 0.4`? What about `1.0`? Then try it.

## Mission 2: Use a supplied method

We have supplied a few more stamp methods. Pick one.

1. Read its parameters. What does each argument control?
2. Add a new `if` to `keyPressed()` that calls it with a new key.
3. You are done when the new key stamps that drawing at the mouse.

## Mission 3: Design your own stamp

Every stamp method follows the same pattern:

```java
public void drawMyStamp(int x, int y, double s) {
    pushMatrix();
    translate(x, y);     // move the origin to (x, y)
    scale((float) s);    // grow or shrink everything below

    // draw your shape centered around (0, 0)

    popMatrix();         // put the origin back
}
```

1. Sketch your idea on paper first. Center it on (0, 0).
2. Write the drawing code inside the pattern. Use only `0`-based coordinates, no `x` or `y`.
3. Give it a key in `keyPressed()`.
4. Stamp a full fall scene.
