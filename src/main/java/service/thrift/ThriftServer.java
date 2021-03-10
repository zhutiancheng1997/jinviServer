package service.thrift;

import org.apache.log4j.Logger;
import org.apache.thrift.TProcessorFactory;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.server.THsHaServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TTransportException;
import service.hbase.dcProductConfig;


public class ThriftServer {
    private static Logger logger = Logger.getLogger(ThriftServer.class);

    public static void main(String[] args) throws TTransportException {

            TNonblockingServerSocket socket = new TNonblockingServerSocket(9563);
            THsHaServer.Args arg = new THsHaServer.Args(socket).minWorkerThreads(1).maxWorkerThreads(10);
            dcSendProductService.Processor<dcSendProductServiceImpl> processor =
                    new dcSendProductService.Processor<>(new dcSendProductServiceImpl());

            arg.protocolFactory(new TCompactProtocol.Factory());
            arg.transportFactory(new TFramedTransport.Factory());
            arg.processorFactory(new TProcessorFactory(processor));

            TServer server = new THsHaServer(arg);
//        TServer server =new TThreadPoolServer(arg);
            logger.info("server start");
            server.serve();


    }
}
