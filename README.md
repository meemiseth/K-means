Implementation of the K-means clustering algorithm from scratch using Apache Spark

Spark Parallelization Strategy
1. Read the input files
   The first step is to read the two input files passed as the command line arguments.The first file
   contains all the data points and the second file contains the initial centroids.These values are
   read and stored as JavaRDD of vector type using map transformation.
2. MapToPair Transformation
   Create an JavaPairRDD having a datapoint and centroid.Distance between each data point and
   an individual centroid is calculated. The distances are compared and the pair having the shortest
   distance will be added to a new tuple and finally this tuple is returned.
3. reduceByKey
   Here all the data points belonging to a cluster is added up.The final sum and the total count of data points are returned.
4. MapValues
   The sum of the data points and the total count is divided to get the new mean(centroid).
5. MapValues
   A new JavaRDD is created which contains the new centroid s.
6. Calculate the distance between the old and the current centroid
   Compare the difference between all the old and new centroid values. If the difference is equal to zero, convergence point is reached.
   The program will run until the difference between the old and the new centroid is equal to zero and the number of iterations is less 
   then the maximum iteration.
