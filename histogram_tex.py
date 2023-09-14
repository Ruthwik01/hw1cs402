import pandas as pd
import matplotlib.pyplot as plt


df = pd.read_csv('tex.txt', header=None, names=['Address'])
plt.hist(df['Address'], bins=20, color='blue', edgecolor='black')
plt.xlabel('Address')
plt.ylabel('Frequency')
plt.title('Address Histogram')


plt.savefig('tex.png')

plt.show()
