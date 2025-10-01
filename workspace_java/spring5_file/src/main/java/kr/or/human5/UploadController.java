package kr.or.human5;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class UploadController {

	@RequestMapping("/upload.view")
	public String view() {
		
		return "uploadForm";
	}

	@RequestMapping(value="/upload", method=RequestMethod.POST)
	public String upload( MultipartHttpServletRequest req ) throws UnsupportedEncodingException {

		// mutipart로 보내고
		// 1. HttpServletRequest로 받으면 getParameter 사용 못함
		// 2. MultipartHttpServletRequest로 받으면 getParameter 사용 가능
		
		String title = req.getParameter("title");
//		System.out.println(new String(title.getBytes("charSet"), "charSet"));
		String content = req.getParameter("content");
		System.out.println("title: "+ title);
		System.out.println("content: "+ content);
		
		// 파일 처리
		// getParameter 대신 getFile 사용
		MultipartFile mf = req.getFile("file1");
		
		long fileSize = mf.getSize();
		System.out.println("fileSize: "+ fileSize);
		
		String fileName = mf.getOriginalFilename();
		System.out.println("fileName: "+ fileName);
		
		try {
			String path = "C:\\tmp\\upload";
			String safeFileName = path +"\\"+
					System.currentTimeMillis() +"_"+ fileName;
			System.out.println("safeFileName: "+ safeFileName);
			File file = new File(safeFileName);
			
			mf.transferTo( file );
			
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return "redirect:upload.view";
	}
	
	@RequestMapping("/uploads")
	public String uploads( MultipartHttpServletRequest req ) throws UnsupportedEncodingException {

		String title = req.getParameter("title");
//		System.out.println(new String(title.getBytes("charSet"), "charSet"));
		String content = req.getParameter("content");
		System.out.println("title: "+ title);
		System.out.println("content: "+ content);
		
		// 파일 처리
//		MultipartFile mf = req.getFile("file1");
		List<MultipartFile> fileList = req.getFiles("file1");
		for(MultipartFile mf : fileList) {
			long fileSize = mf.getSize();
			System.out.println("fileSize: "+ fileSize);
			
			String fileName = mf.getOriginalFilename();
			System.out.println("fileName: "+ fileName);
			
			try {
				String path = "C:\\tmp\\upload";
				String safeFileName = path +"\\"+
						System.currentTimeMillis() +"_"+ fileName;
				System.out.println("safeFileName: "+ safeFileName);
				File file = new File(safeFileName);
				
				mf.transferTo( file );
				
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return "redirect:upload.view";
	}
}
