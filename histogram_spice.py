import pandas as pd
import matplotlib.pyplot as plt


df = pd.read_csv('spice.txt', header=None, names=['Address'])

plt.hist(df['Address'], bins=20, color='blue', edgecolor='black')
plt.xlabel('Address')
plt.ylabel('Frequency')
plt.title('Address Histogram')


plt.savefig('spice.png')


plt.show()
