import pandas as pd
import numpy as np
df = pd.read_csv('housedatabase.csv', delimiter = ",")
# dg = pd.read_csv('house_value.csv', delimiter = ",")
y = df[' cena']
X = np.array(list(zip(df['dom'],df[' komnata'],df[' zalog'],df[' ploshad'],df[' god'],df[' gorod'],df[' raspolozhenie'])))
print("saved")
for i in range(len(X)):
    a = df['dom']
    a = a[len(X)-1]
    b = df[' komnata']
    b = b[len(X)-1]
    c = df[' zalog']
    c = c[len(X)-1]
    d = df[' ploshad']
    d = d[len(X)-1]
    e = df[' god']
    e = e[len(X)-1]
    f = df[' gorod']
    f = f[len(X)-1]
    g = df[' raspolozhenie']
    g = g[len(X)-1]




print(a,b,c,d,e,f,g)
from sklearn.neighbors import KNeighborsClassifier
neigh = KNeighborsClassifier(n_neighbors = 3)
neigh.fit(X, y)
tg=neigh.predict([[a,b,c,d,e,f,g]]) 
np.savetxt('text.txt',tg)
print("saved")