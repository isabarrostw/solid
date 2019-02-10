# SOLID Principles

## Liskov Substitution Principle
The LSP can be paraphrased as follows:
"Subtypes must be substitutable for their base types"

The LSP is one of the prime enablers of OCP. It is the *substitutability* of subtypes that allows a module,
expressed in terms of a base type, to be extensible without modification. Where the *substitutability* is defined by either an explicit or implicit contract (unit tests are a way to define the contract).

### LSP Violation Scenarios
- A derivative that does *less* than its base is usually not substitutable for that base and therefore violates LSP
- Throwing exceptions in the methods of a derived class whose base don't throw them
- Degenerate functions: functions rewritten in the derivative (although that is not always a violation, depends on the case)

From [Agile Software Development, Principles, Patterns and Practices](https://www.amazon.com/Software-Development-Principles-Patterns-Practices/dp/0135974445)
