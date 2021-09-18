# 1
import datetime
def day_diff(release_date, code_complete_day):
    dt_release = datetime.datetime.strptime(release_date, "%d/%m/%Y")
    dt_code_complete = datetime.datetime.strptime(code_complete_day, "%Y-%d-%m")
    detal = dt_release - dt_code_complete
    return detal.days  

# 2
def alpha_num(sentence):
    pass