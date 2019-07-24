package kafka;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class SampleProducer {
	private static final String topicname="demo-topic1";
	static String key="sample key";
	static String value="sample value =10";
	public static void main(String[] args) {
		Properties props=new Properties();
		props.put("bootstrap.servers", "localhost:9092");
		props.put("key.serializer","org.apache.kafka.common.serialization.StringSerializer");
		props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		KafkaProducer<String,String> sampleproducer=new KafkaProducer<String,String>(props);
		//ProducerRecord<String,String> records=new ProducerRecord<String,String>(topicname,value);
		//sampleproducer.send(records);
		for(int i=0;i<10;i++)
			//sampleproducer.send(new ProducerRecord<String, String>(topicname,"data:"+Integer.toString(i)));
			sampleproducer.send(new ProducerRecord<String, String>(topicname,2,"key","data:"+Integer.toString(i)));
		sampleproducer.close();
	}
}
