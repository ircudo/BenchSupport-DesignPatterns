# Composite Design Pattern

## Steps

1. Create interface `Human`
   a. Note that we use this interface in `addChild` and `addParent` methods of the interface
2. Implement `GradParent`
   a. will have `children` as `List<Human>`
   b. will have `addChild` method implemented
   c. will _not_ have `addParent` method implemented 
3. Implement `Parent`
   a. will have `children` as `List<Human>`
   b. will have `parents` as `List<Human>`
   c. will have `addChild` method implemented
   d. will have `addParent` method implemented  
4. Implement `Child`
   a. will have `parents` as `List<Human>`
   c. will _not_ have `addChild` method implemented
   d. will have `addParent` method implemented  
5. Test Hierarchy 