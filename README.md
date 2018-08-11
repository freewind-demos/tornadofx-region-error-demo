TornadoFx Hello World Demo
==========================

JavaFx version works OK with:

```
Region region = new Region();
region.setPrefSize(Double.MAX_VALUE, 0.0);
```

But TornadoFx reports error:

```
2018-08-10 19:53:34.068 java[92700:416158] PersistentUI: CGSGetRegionData returned error 1007 on line 35
2018-08-10 19:53:34.069 java[92700:416158] PersistentUI: CGSGetRegionData returned error 1007 on line 35
java(92700,0x7fff8bbc1340) malloc: *** mach_vm_map(size=3899830308864) failed (error code=4)
*** error: can't allocate region
*** set a breakpoint in malloc_error_break to debug
java(92700,0x7fff8bbc1340) malloc: *** mach_vm_map(size=3899830308864) failed (error code=4)
*** error: can't allocate region
...
```

Run in your IDE:

- `JavaHello.java`: The JavaFX version
- `KotlinHello.kt`: The TornadoFx version

Update
------

Finally, @bekwam found the real cause, it's a bug of JavaFX, not tornadorFX.

The reason why the Java version has no error, is `new Scene(root, 400, 200)` has a width and height, which avoid the error.

See <https://github.com/edvin/tornadofx/issues/778> for more details.