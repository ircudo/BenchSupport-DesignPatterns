# Adapter Design Pattern

## Steps

1. Create `Shape` interface
2. Create concrete implementations: `Circle`, `Rectangle`
3. Create `Drawing` class so we can draw shapes
4. Test drawing of shapes with no adapter
5. Add package `extra`
   a. Create interface `GeometricShape`
   b. Create concrete classes to implement `GeometricShape`: `Triangle`, `Rhombus`
6. Add package `classAdapter`
   a. Create `TriangleAdapter` to extend `Triangle` and implement `Shape`
   b. Create `RhombusAdapter` to extend `Rhombus` and implement `Shape`
7. Test Class Adapter 
8. Create package `objectAdapter`
   a. Create class `GeometricShapeAdapter` to implement `Shape`
   b. Inject `GeometricShape` into this class as `adaptee`
   c. Override Shape's method using `adaptee`
9. Test Object Adapter