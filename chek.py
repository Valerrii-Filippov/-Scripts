from locust import HttpUser, task, constant_pacing

class MyHttpUserClass(HttpUser):

    host = 'host'
    wait_time = constant_pacing(5)
    @task
    def check(self):
        print('MyCheckTask')