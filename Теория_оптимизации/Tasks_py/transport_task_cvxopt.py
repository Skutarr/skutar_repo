from cvxopt.modeling import variable, op
import time

start = time.time()
x = variable(25, 'x')
 
c = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25]        
z = ( c[0]* x[0]+ c[1]* x[1]+ c[2]* x[2]+ c[3]* x[3]+ c[4]* x[4]
                 + c[5]* x[5]+ c[6]* x[6]+ c[7]* x[7]+ c[8]* x[8]+ c[9]* x[9]
                 + c[10]* x[10]+ c[11]* x[11]+ c[12]* x[12]+ c[13]* x[13]+ c[14]* x[14]
                 + c[15]* x[15]+ c[16]* x[16]+ c[17]* x[17]+ c[18]* x[18]+ c[19]* x[19]
                 + c[20]* x[20]+ c[21]* x[21]+ c[22]* x[22]+ c[23]* x[23]+ c[24]* x[24])


mass1 = ( x[0] +  x[1] +  x[2] +  x[3] +  x[4] <= 12)
mass2 = ( x[5] +  x[6] +  x[7] +  x[8] +  x[9] <= 34)
mass3 = ( x[10] +  x[11] +  x[12] +  x[13] +  x[14] <= 56)
mass4 = ( x[15] +  x[16] +  x[17] +  x[18] +  x[19] <= 78)
mass5 = ( x[20] +  x[21] +  x[22] +  x[23] +  x[24] <= 90)

mass6 = ( x[0] +  x[5] +  x[10] +  x[15] +  x[20] == 90)
mass7 = ( x[1] +  x[6] +  x[11] +  x[16] +  x[21] == 78)
mass8 = ( x[2] +  x[7] +  x[12] +  x[17] +  x[22] == 56)
mass9 = ( x[3] +  x[8] +  x[13] +  x[18] +  x[23] == 34)
mass10 = ( x[4] +  x[9] +  x[14] +  x[19] +  x[24] == 12)
    

x_non_negative = ( x >= 0)    
problem = op( z,[ mass1, mass2, mass3, mass4, mass5, mass6, mass7, mass8, mass9, mass10, x_non_negative])
    
problem.solve(solver='glpk')
        
print("Результат:")
print(x.value)
print("Стоимость доставки:")
print(problem.objective.value()[0])
stop = time.time()
print ("Время :")
print(stop - start)