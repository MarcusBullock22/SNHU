#!/usr/bin/env python
# coding: utf-8

# In[ ]:


import argparse 
import datetime 
import json 
import random 
import uuid 
import string 
import sys 

from animal_shelter import Animal Shelter 

det main(argv): 
    parser = argparse. ArgumentParser() 
    
    parser. add_argument("username", help="AAC"> 
                         
    parser. add_argument("password", help="123") 
                        
    args = parser.parse_args() 
    
    username = args.username 
    
    password = args.password 
    
   # create instance of the object 
                         
    shelter = Animal Shelter(username, password) 
                         
    animal_id = 'A'.join(random.choices(string.ascii_uppercase + string.digits, k = 6)) 
                         
    print('animal_id 's being created' animal_id) 
    
    outcome = json.loads('{"" : 79258,"age_upon_outcome" : "1.6 years", "animal_id" : " + animal_id "", 
                        "animal_type" : "Dog", "breed" "Wolt Shepherd Mix", "color": "Gray", "date_of_birth" : "2013-02-09",
                        "datetime" : "2014-04-11 13:26:20", "monthyear" : "2014-04-11T13:26:08","name":"JakeMo", 
                        "outcome_subtype": "Partner", "outcome_type" "Transfer","sex_upon_outcome" : "Intact Male",
                        "location_lat" : 30.787721881886, "location_long": -97.2735696278757, "age_upon_outcome_in_weeks" 79.6799603174603}> 
                         
#print (outcome) 
if shelter.create(outcome): 

    print("animal added") 
                         
animal = shelter.read({"animal_id":animal_id}) 
print(animal) 
                         
if _name_=='__main__': 
    print("Execution started at " + str(datetime.datetime.now() + " " + struuid uuid40) + "}") 
        main(sys.argv[1: ])

