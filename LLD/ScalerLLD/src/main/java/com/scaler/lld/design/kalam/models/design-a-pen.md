```mermaid
classDiagram
    class Pen {
        <<abstract>>
        -String brand
        -String name
        -PenType type
        -double price
        -WritingStrategy strategy
        +write()* void
    }
    
    class Refillable {
        <<interface>>
        +changeRefill(Refill) void
    }
    
    class NonRefillable {
        <<interface>>
        +changeInk(Ink) void
    }
    
    Pen <|-- GelPen
    Refillable <|-- GelPen
    
    Pen <|-- BallPen
    Refillable <|-- BallPen
    
    Pen <|-- FountainPen
    NonRefillable <|-- FountainPen

    
    class WritingStrategy {
        <<interface>>
        +write()* void
    }
    
    class RoughWritingStrategy {
            +write() void
    }
 
    class SmoothWritingStrategy {
            +write() void
    }

    WritingStrategy <|-- RoughWritingStrategy    
    WritingStrategy <|-- SmoothWritingStrategy
    
    Pen "M" "" --o "1" WritingStrategy : has a

```