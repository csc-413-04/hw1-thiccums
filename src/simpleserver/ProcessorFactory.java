package simpleserver;

class ProcessorFactory {

    public static String makeProcessor(Request rq, Database data) {
        if(!(rq.getValid())) {
            return (new Response("Error")).convertToJson();
        }
        switch (rq.getEndpoint()) {
                case "user":
                    return UserProcess.response(rq, data).convertToJson();
                case "posts":
                    return PostProcess.response(rq, data).convertToJson();
        }
        return  null;
    }
}