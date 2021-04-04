# Check and Alert based on types

This exercise is based on the [BMS monitoring] domain.

Expand the checks and alerts to take care of a variety of types.

## Open for Extensions

How can you minimize the amount of work done to add a new type?
Can you add without modifying existing code?

**Assignment Details:**

Classify Battery and Infers Battery Breaches. Reports Breach Alert to Controller or Email

Divided into the following units

    BreachType-NORMAL,TOO_LOW,TOO_HIGH
    CoolingType-PASSIVE_COOLING,HI_ACTIVE_COOLING,MED_ACTIVE_COOLING
    AlertType-TO_CONTROLLER,TO_EMAIL
    
For the appropriate Battery Inputs, the check is made which infers Battery Breach Type and Alerts the respective breach.
    
**Extensions Provided    **

Added Functionality without modifying existing code.


