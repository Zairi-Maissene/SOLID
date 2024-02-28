// EXECICE DIAGRAM CLASS
/*
@startuml
interface Door {
    lock(): void
    unlock(): void
    open(): void
    close(): void
    timeOutCallback(): void
    proximityCallback(): void
}
class Timer {
    register(long,Door): void
}
class TimedDoor {
    TIME_OUT: boolean
    -_locked: boolean
    -_opened: boolean
    TimedDoor(): Timer
    lock(): void
    unlock(): void
    open(): void
    close(): void
    timeOutCallback(): void
    proximityCallback(): void
}
class Sensor {
    register(Door): void
    isPersonClose(): void
}

class SensingDoor {
    -_locked: boolean
    -_opened: boolean
    SensingDoor(Sensor): void
    lock(): void
    unlock(): void
    open(): void
    close(): void
    timeOutCallback(): void
    proximityCallback(): void
}

SensingDoor -[dashed]-> Door
TimedDoor -[dashed]-> Door

SensingDoor ---- Sensor
Sensor ---- Door
TimedDoor ---- Timer
Door ---- Timer
@enduml
*/


// Correction DIAGRAM CLASS

@startuml
class Timer {
    register(long,Door): void
}
class TimedDoor {
    TIME_OUT: boolean
    -_locked: boolean
    -_opened: boolean
    TimedDoor(): Timer
    lock(): void
    unlock(): void
    open(): void
    close(): void
}
class Sensor {
    register(Door): void
    isPersonClose(): void
}

class SensingDoor {
    _locked: boolean
    _opened: boolean
    SensingDoor(Sensor): void
    lock(): void
    unlock(): void
    open(): void
    close(): void
    proximityCallback(): void
}
interface Door {
    lock(): void
    unlock(): void
    open(): void
    close(): void
}
interface ITimeOut{
    timeOutCallback(): void
}
interface IProximity {
    proximityCallback(): void
}

SensingDoor -[dashed]-> IProximity
SensingDoor -[dashed]-> Door

TimedDoor -[dashed]-> Door
TimedDoor -[dashed]-> ITimeOut

SensingDoor ---- Sensor
TimedDoor ---- Timer
ITimeOut ---- Timer
Sensor ---- IProximity

@enduml