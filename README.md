# SoftEng_State-Pattern_Lab-Assignment-2

### Problem:

A vending machine needs to manage different states, including "Idle", "ItemSelected", "Dispensing", and "OutOfOrder". Each state has specific rules and restrictions regarding allowed operations, and the vending machine has associated attributes like item inventory and balance.

### Requirements:
<ol>
  <li>
    Idle State:
    <ul>
      <li> Allow item selection. </li>
      <li> Disallow dispensing items and inserting coins. </li>
    </ul>
  </li>
  <li>
    ItemSelected State:
    <ul>
      <li> Allow inserting coins and dispensing items. </li>
      <li> Disallow item selection. </li>
    </ul>
  </li>
  <li>
    Dispensing State:
    <ul>
      <li> Allow no operations. </li>
      <li> Automatically transition back to the "Idle" state after dispensing is complete. </li>
    </ul>
  </li>
  <li>
    OutOfOrder State:
    <ul>
      <li> Disallow all operations. </li>
    </ul>
  </li>
</ol>

Current System: The system currently relies on conditional statements within the VendingMachine class to check the machine state and determine valid actions. This approach becomes cumbersome and error-prone as the number of states and their associated logic grows.

### Implement the State Pattern to improve code maintainability and flexibility:
<ol>
  <li>
    Define VendingMachine States:
    <ul>
      <li> Create separate classes representing different machine states: IdleState, ItemSelectedState, DispensingState, and OutOfOrderState. </li>
    </ul>
  </li>
  <li>
    Implement State Interface:
    <ul>
      <li> Define an interface VendingMachineState with methods for common actions like selectItem, insertCoin, dispenseItem, and setOutOfOrder. </li>
    </ul>
  </li>
  <li>
    Implement State Behaviors:
    <ul>
      <li> Each concrete state class implements the VendingMachineState interface, providing specific behavior for its respective state. For example, the IdleState class would allow item selection, while the OutOfOrderState wouldn't allow any operations. </li>
    </ul>
  </li>
  <li>
    Update VendingMachine Class:
    <ul>
      <li> Include attributes for item inventory and balance. </li>
      <li> Remove state-specific logic from the VendingMachine class. </li>
      <li> Introduce a reference to the current VendingMachineState object. </li>
      <li> Delegate actions like selectItem, insertCoin, dispenseItem, and setOutOfOrder to the current state object through its corresponding methods. </li>
    </ul>
  </li>
</ol>

### UML Class Diagram
![alt text](https://github.com/ThezzaSalcedo/SoftEng_State-Pattern_Lab-Assignment-2/blob/main/LabAssign2-UML-Class-Diagram.png)
