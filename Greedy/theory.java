//general algorithm of greedy approach 

Algorithm Greedy(a, n){
    for(i =1 to n)
    {
        x=select(a);
        if(feasible(x))
        {
            Solution=Solution+x;
        }
    }
}

//example of buying a car, like when we go out in the market, we do not run through all the cars in the city, test iyt out and then select the car of our preference
//instead what we do, is that we put some of oudr filtering mechanisms and post that we make the choice of whether we need to buy the car or not 

//Knapsack problem 
