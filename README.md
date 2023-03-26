# Number-Of-Employees-Under-Every-Manager1
1. You are given number N and 2*N number of strings that contains mapping of the employee and his manager.
2. An employee directly reports to only one manager. 
3. All managers are employees but the reverse is not true.
4. An employee reporting to himself is the CEO of the company.
5. You have to find the number of employees under each manager in the hierarchy not just their direct reports.

input:
6
A C
B C
C F
D E
E F
F F

output:
A 0
B 0
C 2
D 0
E 1
F 5
