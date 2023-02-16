# Decorator Pattern

## Steps

- Create an interface (`Shape`)
- Create concrete classes implementing the same interface (`Circle`, `Rectangle`)
- Create an abstract decorator class (`ShapeDecorator`) implementing the same interface.
- Create a concrete decorator class (`RedShapeDecorator`) extending the above abstract decorator class.
  - Use the concrete decorator class created above to decorate interface objects.
- Lastly, verify the output