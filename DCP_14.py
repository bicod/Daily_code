import random 
interval=1000

circle_point=0
sqr_point=0


for i in range(interval**2):
  r_x=random.uniform(-1,1)
  r_y=random.uniform(-1,1)

  origin_distance = r_x**2 + r_y**2

  if origin_distance <= 1:
    circle_point += 1

  sqr_point += 1

  pi = 4*(circle_point/sqr_point)
print("PIE VALUE =", pi)
